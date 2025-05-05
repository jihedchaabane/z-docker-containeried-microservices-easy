# z-springboot-hello
-----------------------------------------------------
http://localhost:7775/swagger-ui/index.html
http://10.0.0.137:7775/swagger-ui/index.html

curl http://10.0.0.137:7775/hello
-----------------------------------------------------
IN "10.0.0.137" do:
-----------------------------------------------------
sudo firewall-cmd --add-port=7775/tcp --permanent
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all

---Fermer le port 7775 -------------------------------
sudo firewall-cmd --permanent --remove-port=7775/tcp
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all
