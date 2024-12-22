def specsymbols(sp):
    answer = []
    for string in sp:
        answer.append(string.replace())

with open('scedule.xml', 'r', encoding='utf-8') as xml_file:
    xml_data = xml_file.read().split('\n')

answer = ''
ots = 0
using = []
com = False
for string in xml_data:
    x = string.strip()
    if x.find('<!--') != -1:
        x = x.replace('<!--', '#')
        if x == '#':
            x = ''
        com = True
    if x.find('-->') != -1:
        com = False
        x = x.replace('-->', '')
    if x[:2] == '</':
        ots -= 1
        using.remove(x[2:-1])
        continue
    x = x.replace('<', '', 1).replace('>', ': ', 1).strip()
    if x[x.find(':')+1:].strip():
        if x.find('</') != -1:
            x = x[:x.find('</')]
            if com:
                answer += '    ' * ots + '#' + x + '\n'
            else:
                answer += '    ' * ots + x + '\n'
        else:
            using.append(x[:x.find(':')])
            y = x[x.find(':')+1:]
            x = x[:x.find(':')+1]
            if com:
                answer += '    ' * ots + '#' + x + '\n'
            else:
                answer += '    ' * ots + x + '\n'
            if string.strip().replace('<!--', '').replace('-->', '').find('<') != -1 \
                    and string.strip().replace('<!--', '').replace('-->', '').find('>') != -1 \
                    and string.strip().replace('<!--', '').replace('-->', '').find('</') == -1:
                ots += 1
            answer += '    ' * ots + 'text:' + y + '\n'
    else:
        answer += '    ' * ots + x + '\n'
        if string.strip().replace('<!--', '').replace('-->', '').find('<') != -1\
                and string.strip().replace('<!--', '').replace('-->', '').find('>') != -1\
                and string.strip().replace('<!--', '').replace('-->', '').find('</') == -1:
            ots += 1
        using.append(x[:-1])
otst = [len(string) - len(string.lstrip()) for string in answer.split('\n')]
sp = [string[:string.find(':')].strip() for string in answer.split('\n')]
ans2 = [string for string in answer.split('\n')]
print(sp)

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
ans3 = ''
for i in ans2:
    if i.strip() != '':
        ans3 += i + '\n'
with open('try1.yaml', 'w', encoding='utf-8') as yaml_file:
    yaml_file.write(ans3)