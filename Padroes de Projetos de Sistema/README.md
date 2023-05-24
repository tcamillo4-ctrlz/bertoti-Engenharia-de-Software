Tiago Camillo

## Atividade - Padrões de Projetos de Sistema

Tipos de Padrões de Projetos utilizados:
- Strategy
- Observer
- Composite
- Singleton
- Facade


<table>
  <tr>
    <td><b>Padrão</b></td>
    <td><b>Anti-Padrão</b></td>
    <td><b>Descrição</b></td>
    <td><b>Problema que resolve</b></td>
  </tr>
  <tr>
    <td>Strategy</td>
    <td>Herança</td>
    <td>Encapsula uma família de algoritmos e os torna intercambiáveis usando polimorfismo</td>
    <td>Duplicação de código</td>
  </tr>
  <tr>
    <td>Observer</td>
    <td>Acoplamento excessivo</td>
    <td>Define um mecanismo de assinatura para notificar vários objetos sobre eventos que aconteçam com o objeto observado</td>
    <td>Chamadas excessivas e desnecessárias de objetos</td>
  </tr>
  <tr>
    <td>Composite</td>
    <td>Tratamento diversificado de classes</td>
    <td>Permite tratar objetos individuais (Leaf) e grupos de objetos (Composite) de maneira uniforme, como elementos da mesma estrutura hierárquica</td>
    <td>Tratamento de classes Leaf e Composite de formas diferentes</td>
  </tr>
  <tr>
    <td>Singleton</td>
    <td>Diversas instâncias da mesma classe</td>
    <td>Garante que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância</td>
    <td>Várias instâncias de uma mesma classe e Sobrescrição de instância</td>
  </tr>
  <tr>
    <td>Facade</td>
    <td>Classe Fachada sobrecarregada de funcionalidades/responsabilidades</td>
    <td>Fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes</td>
    <td>Complexidade e falta de simplicidade com conjunto de classes</td>
  </tr>
</table>
