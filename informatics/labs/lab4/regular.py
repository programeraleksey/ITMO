import re

with open('scedule.xml', 'r', encoding='utf-8') as xml_file:
    xml_data = xml_file.read().split('\n')

com = False
ots = 0
answer = ''
for string in xml_data:
    x = string.strip()
    if com:
        if x != '-->':
            x = '#' + x
    if re.match(r'^<([^<>]+)>[^<>#]+</\1>', x):
        if x.find('<!--') == -1:
            x = x.replace('<', '', 1).replace('>', ': ', 1)[0:x.find('</')]
            answer += '    ' * ots + x + '\n'
        else:
            x = x.replace('<', '', 1).replace('>', ': ', 1).replace('<!--', '#').replace('-->', '')
            answer += '    ' * ots + x[0:x.find('</')] + ' ' + x[x.find('#')::] + '\n'
    elif re.match(r'^<!--[^\n]+-->', x):
        x = x.replace('<!--', '#').replace('-->', '')
        answer += '    ' * ots + x + '\n'
    elif re.match(r'^<!--', x):
        com = True
    elif re.match(r'-->', x):
        x = x.replace('-->', '')
        if x != '':
            answer += '    ' * ots + '#' + x
        com = False
    elif re.match(r'^</[^\n<>]+>', x):
        ots -= 1
    elif re.match(r'^<[^\n<>]+>', x):
        x = x.replace('<', '').replace('>', ':')
        answer += '    ' * ots + x + '\n'
        ots += 1
otst = [len(string) - len(string.lstrip()) for string in answer.split('\n')]
sp = [string[:string.find(':')].strip() for string in answer.split('\n')]
ans2 = [string for string in answer.split('\n')]
for n, name in enumerate(sp):
    if name == '':
        continue
    if name[0] == '#':
        continue
    names = [name]
    spis = False
    cur = otst[n]
    end = 999
    n2 = n + 1
    for name2 in sp[n+1:]:
        if name2 == '':
            n2 += 1
            continue
        if name2[0] == '#':
            n2 += 1
            continue
        if otst[n2] < cur:
            end = n2
            break
        elif otst[n2] == cur:
            if name2 not in names:
                names.append(name2)
            else:
                spis = True
        n2 += 1
    if spis:
        g = n
        for string in ans2[n:end]:
            if len(string) - len(string.lstrip()) == cur:
                if string.lstrip()[:2] != '- ':
                    ans2[g] = ' ' * cur + '- ' + string.strip()
            g += 1
with open('try1.yaml', 'w', encoding='utf-8') as yaml_file:
    yaml_file.write('\n'.join(ans2))