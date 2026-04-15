Feature: Flujo completo usuario PetStore

    Background:
        * url baseUrl
        * def username = 'manuelaTest'
        * def user =
        """
        {
        "id": 1001,
        "username": "#(username)",
        "firstName": "Manuela",
        "lastName": "Acevedo",
        "email": "test@test.com",
        "password": "Manu12345",
        "phone": "3122093243",
        "userStatus": 1
        }
        """

    Scenario: Crear usuario
        Given path 'user'
        And request user
        When method post
        Then status 200

    Scenario: Buscar usuario creado
        Given path 'user', username
        When method get
        Then status 200
        And match response.username == username

    Scenario: Actualizar usuario
        * set user.firstName = 'NuevoNombrePrueba'
        * set user.email = 'nuevonombre@email.com'

        Given path 'user', username
        And request user
        When method put
        Then status 200

    Scenario: Buscar usuario actualizado
        Given path 'user', username
        When method get
        Then status 200
        And match response.firstName == 'NuevoNombrePrueba'
        And match response.email == 'nuevonombre@email.com'

    Scenario: Eliminar usuario
        Given path 'user', username
        When method delete
        Then status 200