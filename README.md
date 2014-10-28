#11/octubre
#Jose Luis Cobián 
#Programa que invoca un metodo remoto mediante RMI
#El programa cliente hace una invocación pasando 
#una cadena y el servidor la trasforma a Mayusculas 
# y manda una cadena propia concatenada con la que 
# se mando regresandolo al cliente. 

-----------------
PARA COMPILAR 
Servidor
- Compilar las clases
  javac ServerRmi.javac
- Crear el stub 
  rmic ObjetoRemotoImple
  copiar el stub que se creo a la carpeta del Cliente
Cliente 
- Javac ClientRmi

LEVANTAR EL SERVICIO
rmiregistry 5001 

EJECUCION 
Ejecutamos servidor 
- java ServerRMI 
Ejecutamos Cliente
- java ClientRMI
