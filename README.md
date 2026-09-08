# 📦 Sistema de Gerenciamento de Estoque (Java Vanilla)

Sistema de gerenciamento de estoque desenvolvido em **Java puro** estruturado em camadas (MVC/Arquitetura limpa), focado em controle de catálogo, segurança de acesso, persistência em arquivos e controle de movimentação por lotes utilizando a lógica **PEPS (Primeiro a Entrar, Primeiro a Sair / FIFO)**.

---

## 🚀 Funcionalidades Principais

* **🔒 Autenticação de Usuário:** Controle de acesso restrito ao sistema.
* **📂 Gestão de Catálogo (CRUD):** Cadastro, listagem, busca (por ID ou nome), atualização e remoção de tipos de produtos.
* **🔄 Controle de Estoque por Lotes (PEPS):** Separação entre o cadastro do item e a entrada física. As saídas dão baixa automática priorizando os lotes mais antigos.
* **⚠️ Alertas de Estoque Mínimo:** Monitoramento automático para notificar quando um produto atingir o limite crítico.
* **🛡️ Resiliência e Validações:** Tratamento de erros de entrada (`try-catch`) para evitar falhas por dados inválidos.
* **💾 Persistência Automática:** Salvamento do estado do banco de dados/arquivos após operações críticas (cadastro, atualização, remoção e movimentação).

---

## 📂 Estrutura do Projeto

O projeto está organizado em pacotes para separar responsabilidades de acordo com a arquitetura padrão:

```text
src/
└── main/
    └── java/
        └── com/
            └── estoque/
                ├── Main.java         # Ponto de entrada da aplicação
                ├── model/            # Classes de domínio (Produto, Usuario, Lote, etc.)
                ├── repository/       # Lógica de persistência e manipulação de arquivos
                ├── service/          # Regras de negócio (lógica PEPS, validações, alertas)
                └── view/             # Interface de interação com o usuário (Console)