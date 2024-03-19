# Proyecto PeluqueriaCanina con Java, MySQL y el CRUD con JPA.
### Algunos pasos a tener en cuenta:
- **Paso01**: Crear un proyecto en maven con el nombre de PeluqueriaCanina.
- **Paso02**: Creamos 3 paquetes con el nombre igu, logica y persistencia.
- **Paso03**: En el paquete igu creamos los JFrame Principal, CargaDatos, VerDatos.
- **Paso04**: El el paquete logica creamos las Clases Duenio, Mascota, Controladora.
- **Paso05**: En el paquete persistencia creamos la Clase ControladoraPersistencia.
- **Paso06**: Creamos una base de datos con el nombre de peluqueria_canina.
- **Paso07**: En Services, Databases(clic derecho -> New Connection), completamos los campos (en JDBC URL: ?serverTimezone=UTC) y nos conectamos con la BD (clic en Test Connection para probar si nos conectamos).
- **Paso08**: Clic derecho en el paquete de persistencia, seleccionamos Persistence Unit... , llenamos los campos (en Persistence Unit Name: PeluCaninaPU, en Databases Connection seleccionamos la conexion creada y en Table Generation Strategy elegimos Create).
- **Paso09**: Mapeamos las Clases.
- **Paso10**: En persistence.xml, clic en Add Class.. y seleccionamos nuestras Clases mapeadas.
- **Paso11**: Creamos los JpaController para ello, clic derecho en el paquete persistencia, seleccionamos JPA Controller Classes from Entity Classes..., seleccionamos nuestras clases mapeadas y clic en Add All, clic en Next, elegimos como paquete a persistencia y clic en finish.
- **Paso12**: Agregamos en DuenioJpaController y mascotaJpaController lo siguiente:
  
 `1. public DuenioJpaController() {`

 `2. 		emf = Persistence.createEntityManagerFactory("PeluCaninaPU");`
 
 `3. }`
 
- **Paso13**: En el JFrame de VerDatos, clic derecho en el JFrame principal y elegimos Events->Window->windowOpend (esto es para cuando se habre el JFrame nos cargue los datos a nuestra tabla acorde al evento)
- **Paso14**: Para crear el JFrame de ModificarDatos, copiamos el JFrame CargaDatos y clic derecho en el paquete igu paste->Refactor Copy.
