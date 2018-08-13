echo "execute mvn clean..."

mvn clean > /dev/null

echo "execute mvn package..."

mvn package > /dev/null

echo "cp jar..."

cp target/filetest.jar ./docker/java/

cd docker/mysql/

docker build -t mysql:v1.1 . > /dev/null

cd ..
cd java/

docker build -t jdk:v1.1 . > /dev/null

docker-compose up -d