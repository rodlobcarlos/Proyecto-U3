create database proyecto_U3;
use proyecto_U3;

CREATE USER IF NOT EXISTS 'carlos'@'%' IDENTIFIED BY 'clave';
--  Asignar privilegios
GRANT ALL PRIVILEGES ON `proyecto_U3`.* TO 'carlos'@'%';
--  Refrescar
FLUSH PRIVILEGES;