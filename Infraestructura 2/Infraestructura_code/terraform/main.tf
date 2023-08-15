provider "aws"{
    region = "us-east-1"
    shared_credentials_files = ["$HOME/.aws/credentials"]
}  

resource "aws_instance" "instancia_linux" {
    ami                     = "ami-09cd747c78a9add63"
    instance_type           = var.esto_es_el_tipo_de_instancia
    key_name = "llave"   
    tags = {
        Name = "Instancia_desde_terraform"
        Ambiente = "Ambiente de desarrollo"
    }
}