# Sistema de Controle de Versão

## Configuração inicial para uso do Git
### Configuração de nome de usuário e email no Git
Sem configurar o nome e o email não é possível fazer commit pelo terminal
```
git config −−global user.name "Seu Nome Completo"
git config −−global user.email "seu−email@example.com"
```
### Criando Personal Access Token (PAT) no GitHub
Um PAT, é um token pessoal, um substituto para sua senha. O PAT é necessário para poder confirmar quem você é na hora de realizar commits.
1. Abra o GitHub
2. Vá em Configurações 
3. Clique no botão Developer Setting
4. Clique em Personal access tokens > tokens (classic)
5. Clique em Generate new token
6. Clique em Generate new token (classic)
7. Coloque um nome no token, selecione uma data de expiração e selecione os scopos para o token
8. Clique em Generate token


### Salvar em cache as credenciais do PAT
É mais prático salvar as credenciais no cache para não precisar colar o PAT sempre que for fazer alterações remotas.
```
git config −−global credential.helper 'cache −−timeout=3600'
```
## Qual a diferença entre git merge e git rebase?