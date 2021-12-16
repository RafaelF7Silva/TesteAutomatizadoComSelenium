#language: pt
   @cadastro
  Funcionalidade: Cadastro do usuario

    @cadastro_sucesso
    Cenario: Registrar um novo usuario com sucesso
      Dado  que estou na tela de login
      E acesso o cadastro de usuario
      Quando preencho o formulario
      E clico em registrar
      Então vejo  a mensagem  de cadastro concluido
