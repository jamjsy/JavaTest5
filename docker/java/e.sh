#while ! nc -z ${MYSQL_IP} ${MYSQL_PORT}; do sleep 3; done
sleep 5
java -jar filetest.jar