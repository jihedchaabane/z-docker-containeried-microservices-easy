# z-docker-containeried-microservices-easy

# Jenkins
http://10.0.0.137:8080/
# SonarQube
http://10.0.0.137:9000/
# Eureka
http://10.0.0.137:8761/
# Config Server
http://10.0.0.137:8762/
# Springboot Admin
http://10.0.0.137:8763/

# z-springboot-hello
http://10.0.0.137:7775/swagger-ui/index.html
# z-springboot-hello-world-service
http://10.0.0.137:7776/swagger-ui/index.html
# z-springboot-bar-service =>> (VAULT configured)
http://10.0.0.137:7777/swagger-ui/index.html
# z-springboot-foo-service
http://10.0.0.137:7778/swagger-ui/index.html

# Vault container
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



