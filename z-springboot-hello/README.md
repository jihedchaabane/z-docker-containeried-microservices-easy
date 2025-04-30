# z-springboot-hello
-----------------------------------------------------
IN "10.0.0.129" do:
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
-----------------------------------------------------
http://10.0.0.129:7775/swagger-ui/index.html

curl http://10.0.0.129:7775/hello