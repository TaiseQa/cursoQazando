#language: pt
@desconto
Funcionalidade: receber o cupom desconto da qazando
  Eu como usuario da qazando
  quero recebr um desconto
  para comprar um curso com valor reduzido

  @gerar_cupom
  Cenario: visualizar codigo de desconto
    Dado que estou no site da qazando
    Quando eu preeencho meu e-mail
    E clico em ganhar cupom de desconto
    Entao e vejo o codigo de desconto

  @teste-falha
  Cenario: test com falha
    Dado que eu tenho cupom gerado
    Quando eu falho