# z-springboot-hello
-----------------------------------------------------
IN "10.0.0.137" do:
-----------------------------------------------------
sudo firewall-cmd --add-port=7778/tcp --permanent
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all

---Fermer le port 7778 -------------------------------
sudo firewall-cmd --permanent --remove-port=7778/tcp
sudo firewall-cmd --reload

sudo firewall-cmd --list-ports
sudo firewall-cmd --list-all
-----------------------------------------------------
http://10.0.0.137:7778/swagger-ui/index.html

curl http://10.0.0.137:7778/
curl http://10.0.0.137:7778/foo-properties
curl http://10.0.0.137:7778/foobar
curl http://10.0.0.137:7778/bar-properties
-----------------------------------------------------
