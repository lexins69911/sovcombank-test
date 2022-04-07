echo "Building projects..."
set echo off

echo "Building server-discovery project"
set echo off
cd registry
sh build.sh > /dev/null

echo "Building email-sender servcice"
set echo off
cd ..
cd email-sender
sh build.sh > /dev/null

echo "Building push-sender servcice"
set echo off
cd ..
cd push-sender
sh build.sh > /dev/null

echo "Building sms-sender servcice"
set echo off
cd ..
cd sms-sender
sh build.sh > /dev/null

echo "Building gateway servcice"
set echo off
cd ..
cd gateway
sh build.sh > /dev/null

cd ..

set echo on
docker-compose build
docker-compose up