Lista para filtrar conteúdo pelo username, name ou email mostrando.
Foi criada uma API para consumir os dados e assim poder filtrar os campos necessários na lista de usuários.
Anotações foram usadas para evitar a geração de muitas linhas de código de exemplo (Lombok).
Swagger foi usado para mostrar as chamadas dos método de uma forma mais profissional.
A arquitetura pensada para a melhor solução séria.
O aplicativo de página única pode ser o Amazon S3 criando um bucket, se crescer, podemos usar a cópia do Cloudfront em diferentes regiões
API Rest Criada com java usando frameworkspring e pode ser executada no container docker
contêiner docker pode ser executado em uma instância EC2 e podemos executar um MYsql
Se crescer muito, pode migrar para o Amazon RDS
Pode ser migrado também o aplicativo Java para o Bind Stock, assim pode ser executado o mesmo aplicativo em contêineres diferentes
EC2 Amazon Web Services (AWS) que permite aos usuários criar e executar máquinas virtuais na nuvem.

Uma instância do EC2 é essencialmente um servidor virtual que pode ser usado para executar aplicativos, armazenar e processar dados, executar bancos de dados, hospedar sites

JPA foi usado para mapeamento de dados e persistência.
Assim, não é necessário criar tabelas e campos a partir do banco de dados. A partir do back-end, ele é gerado automaticamente.

A melhorar pode ser usar Design Patterns como um DAO para abstrair a recuperação de dados.
