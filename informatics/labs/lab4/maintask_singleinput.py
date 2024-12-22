def checkcom(y, c):
    x = y
    com = c
    if com:
        x = '#' + x
        if x[-2]+ x[-1] == '--':
            com = False
            x = x.replace('--', '')
            if x.find('<') != -1:
                x = x.replace('<', '').replace('>', ': ')[0:x.find('</')]
    elif x[0:3] == '!--':
        x = x.replace('!--', '#', 1)
        if x[-2]+ x[-1] == '--':
            x = x.replace('--', '')
        else:
            com = True
        if x.find('<') != -1:
            x = x.replace('<', '').replace('>', ': ')[0:x.find('</')]
    return x, com, x[0] == '#'


with open('odnastroka.xml', 'r', encoding='utf-8') as xml_file:
    xml_data = xml_file.read()
ots = 1
answer = xml_data.split('><')[0].replace('<', '') + ':\n'
com = False
for string in xml_data.split('><')[1::]:
    x, com, iscom = checkcom(string, com)
    if iscom:
        answer += '    ' * ots + x + '\n'
    else:
        if x[0] == '/':
            ots -= 1
        elif x.find('</') != -1:
            x = x.replace('>', ': ', 1)[0:x.find('</')]
            answer += '    ' * ots + x + '\n'
        else:
            answer += '    ' * ots + x + ':\n'
            ots += 1


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

with open('try1.yaml', 'w', encoding='utf-8') as yaml_file:
    yaml_file.write('\n'.join(ans2))