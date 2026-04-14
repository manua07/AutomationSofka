Feature: Compra en OpenCart

  Scenario: Compra exitosa como invitado
    Given el usuario abre la pagina de OpenCart
    When agrega dos productos al carrito
    And visualiza el carrito
    And realiza el checkout como invitado
    Then la compra se realiza correctamente