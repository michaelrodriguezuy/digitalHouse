#!/bin/bash

# Instalación de Git
sudo apt update
sudo apt install -y git

# Instalación de Terraform
sudo apt update
sudo snap install terraform --classic

# Instalación de Ansible
sudo apt install -y ansible

# Instalación de Docker
sudo apt install -y docker.io
sudo usermod -aG docker $USER

# Instalación de Docker Compose
sudo apt install -y docker-compose

# Instalación de la CLI de AWS
sudo apt install -y awscli

# Instalación de gparted
sudo apt install -y gparted

# Instalación de Visual Studio Code
sudo snap install code --classic

# Instalación de Google Chrome
wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | sudo apt-key add -
echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" | sudo tee /etc/apt/sources.list.d/google-chrome.list
sudo apt update
sudo apt install -y google-chrome-stable