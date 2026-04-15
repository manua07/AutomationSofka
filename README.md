# AutomationE2ESoftka

INSTRUCCIONES PARA EJECUTAR PRUEBAS

Configuración:

Para ejecutar las pruebas UI se debe tener configuradas las siguientes variables de entorno en el sistema:
- Tener instalado Java 17.
- Tener instalado maven.
En los archivos pom.xml se definen los plugins necesarios con sus respectivas versiones.

Ejecución de los tests:
 - Clonar repositorio en la máquina local:
  	   git clone https://github.com/manua07/AutomationSofka
   
 - Importar el proyecto en IDE.

 - Navegar en el directorio del proyecto
      cd AutomationSofka

 - Antes de ejecutar las pruebas, utilizar el comando:
    mvn clean install -U
    mvn clean verify   

 - Para ejecutar todas las pruebas se utiliza el siguiente comando:
   	mvn test

- Primero, se ejecutaran las pruebas UI las cuales se hacen a través del navegador y se generan los reportes en la carpeta target:
  Ejemplo de reporte index.html
  <img width="1753" height="721" alt="image" src="https://github.com/user-attachments/assets/c984f193-8a9b-494a-a0e2-a48bd4d745bf" />

  **Estos reportes continene: screenshots de las diferentes paginas y sus pasos, reporte final con estadisticas; estados de las ejecuciones, tiempos, escenarios, cobertura y mas datos que permiten análisis y toma de decisiones.**

- Segundo, se ejecutaran las pruebas API las cuales se hacen a través de consola y generan los reportes en la carpeta target:
  Ejemplo de reporte karate-summary.html
  <img width="1778" height="865" alt="image" src="https://github.com/user-attachments/assets/0e6c8923-4b87-4963-add3-7b4a7efb5e42" />
  
  **Este reporte contiene datos como: escenarios de pruebas, datos que se usaron en los diferentes metodos, ejecución de pasos, tiempos, estados de las ejecuciones y otros datos que permiten analizar el comportamiento del test, los metodos de una api**

- Al final, se evidencia la ejecucion correcta de las pruebas en la terminal:
    <img width="763" height="264" alt="image" src="https://github.com/user-attachments/assets/956ba8ff-37bb-4504-a29f-dbdae7c69318" />
    
