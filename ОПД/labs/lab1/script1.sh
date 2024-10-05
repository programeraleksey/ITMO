#1 пункт
mkdir lab0
cd lab0
mkdir arcanine4
cd arcanine4
touch beldum
mkdir blaziken
touch loudred
touch hoppip
touch psyduck
echo '''Развитые способности Light Metal Heavy Metal''' > beldum
echo '''Тип
покемона NORMAL NONE''' > loudred
echo '''Ходы Bounce Defense Curl Giga Drain
Helping Hand Seed Bomb Silver Wind Sleep Talk Snore Synthesis Worry
Seed''' > hoppip
echo '''Ходы Aqua Tail Body Slam Brine Counter Dive Double-Edge
Dynamicpunch Focus Punch Ice Punch Icy Wind Iron Tail Low Kick Magic
Coat Mega Kick Mega Punch Mud-Slap Role Play Seismic Toss Signal Beam
Sleep Talk Snore Swift Wonder Room Worry Seed Zen
Headbutt''' > psyduck
cd ..
touch conkeldurr6
touch froslass7
touch pineco1
echo '''Тип диеты Omnivore''' > conkeldurr6
echo '''Живет Taiga
Tundra''' > froslass7
echo '''Способности
Protect Tackle Selfdestruct Bug Bite Take
Down Rapid Spin Bide
Natural Gift Spikes Payback Explosion Iron
Defense Gyro Ball Double-Edge''' > pineco1
mkdir snorlax4
cd snorlax4
mkdir haunter
touch drapion
touch chikorita
echo '''satk=6 sdef=8
spd=10''' > drapion
echo '''Развитые способности Leaf
Guard''' > chikorita
cd ..
mkdir swanna1
cd swanna1
touch starmie
touch dodrio
mkdir donphan
echo '''Способности Torrent Mind Mold Natural Cure
Illuminate''' > starmie
echo '''Тип покемона NORMAL FLYING''' > dodrio
cd ..

#2 пункт
chmod u=rx,g=wx,o=rwx arcanine4
cd arcanine4
chmod 600 beldum
chmod 555 blaziken
chmod 660 loudred
chmod u=rw,g=w,o= hoppip
chmod 404 psyduck
cd ..
chmod 404 conkeldurr6
chmod 604 froslass7
chmod u-w pineco1
chmod 317 snorlax4
cd snorlax4
chmod u=rwx,g=rx,o=w haunter
chmod ugo=r drapion
chmod u=rw,g=,o=r chikorita
cd ..
chmod go=wx swanna1
cd swanna1
chmod 400 starmie
chmod 666 dodrio
chmod u=rx,g=wx,o=rwx donphan
cd ..

#3 пункт
cp -r arcanine4 snorlax4/haunter
chmod u+w arcanine4
cd arcanine4
ln ../conkeldurr6 hoppipconkeldurr
cd ..
chmod u-w arcanine4
cat conkeldurr6 > snorlax4/drapionconkeldurr
chmod u+w swanna1/donphan
cp conkeldurr6 swanna1/donphan
chmod u+w arcanine4
cd arcanine4
ln -s ../froslass7 psyduckfroslass
cd ..
chmod u-w arcanine4
ln -s arcanine4 Copy_16
cat swanna1/starmie arcanine4/psyduck > pineco1_60

#4 пункт
echo 4.1:
wc -l arcanine4/beldum arcanine4/loudred arcanine4/hoppip arcanine4/psyduck snorlax4/drapion snorlax4/chikorita 2>&1 | sort -nr
echo 4.2:
ls -Rt | grep 2>&1 '^b'
echo 4.3:
grep -nv 'e$' arcanine4/*
echo 4.4:
wc -m swanna1/* 1> /tmp/result.txt 2> /tmp/error_log.txt
echo 4.5:
grep -in 'a$' pineco1 2>&1
echo 4.6:
ls -lR 2>/dev/null | sort -k2,2nr | grep '^\(\S\+\s\+\)\{8\}s'

#5 пункт
rm froslass7
chmod u+w arcanine4
rm arcanine4/loudred
rm arcanine4/psyduckfrosla*
rm arcanine4/hoppipconkeldu*
chmod -R u+w arcanine4
rm -r arcanine4
chmod -R u+wr swanna1/donphan
rm -r swanna1/donphan
