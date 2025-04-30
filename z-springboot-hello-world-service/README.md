# z-springboot-hello-world-service
-----------------------------------------------------
IN "10.0.0.129" do:
-----------------------------------------------------
sudo firewall-cmd --add-port=7776/tcp --permanent
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all

---Fermer le port 7776 -------------------------------
sudo firewall-cmd --permanent --remove-port=7776/tcp
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all
-----------------------------------------------------