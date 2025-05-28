# z-docker-containeried-microservices-easy
2_WKS_Z_DOCKER_CONTAINERIED_MICROSERVICES_EASY

# JENKINS
http://10.0.0.137:8080/

# SONARQUBE
http://10.0.0.137:9000/

# ZIPKIN-SERVER
http://10.0.0.137:9411/

# EUREKA
http://10.0.0.137:8761/

# CONFIG-SERVER
http://10.0.0.137:8762/actuator/health

# SPRINGBOOT-ADMIN
http://10.0.0.137:8763/

# SWAGGER-AGGREGATOR
http://10.0.0.137:8766/

# GATEWAY-API
http://10.0.0.137:8766/

#------------------------------------------------------------------------------
#------------------------------------------------------------------------------

# Z-SPRINGBOOT-HELLO
http://10.0.0.137:7775/swagger-ui/index.html

# Z-SPRINGBOOT-HELLO-WORLD-SERVICE
http://10.0.0.137:7776/swagger-ui/index.html

# Z-SPRINGBOOT-BAR-SERVICE =>> (VAULT configured)
http://10.0.0.137:7777/swagger-ui/index.html

# Z-SPRINGBOOT-FOO-SERVICE
http://10.0.0.137:7778/swagger-ui/index.html

# VAULT CONTAINER
http://10.0.0.137:8200/


#### (Config Server) git error : fatal: index file smaller than expected
-Remove the corrupted index file:
	rm .git/index
-Reset the index:
	git reset
-This recreates the .git/index file based on the current HEAD commit: Verify the repository:
	git status
-Optional: Check for deeper corruption:
	git fsck



