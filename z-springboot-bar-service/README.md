# z-springboot-bar-service
-----------------------------------------------------
IN "10.0.0.137" do:
-----------------------------------------------------
sudo firewall-cmd --add-port=7777/tcp --permanent
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all

---Fermer le port 7777 -------------------------------
sudo firewall-cmd --permanent --remove-port=7777/tcp
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all
-----------------------------------------------------
http://10.0.0.137:7777/swagger-ui/index.html

curl http://10.0.0.137:7777/
curl http://10.0.0.137:7777/msg
curl http://10.0.0.137:7777/properties
-----------------------------------------------------
