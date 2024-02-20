# Requisito R10 - Gruppi A6/A11
Componenti:
- Luca Antonio Scolletta - M63/1620
- Erika Morelli - M63/1616
- Andrea Bertolero - M63/1657
- Gennaro Iannicelli - M63/1668
- Giuseppe Gatta - M63/1669
- Nicola Garofalo - N46/3508

# DESCRIZIONE DEL REQUISITO R10
Il requisito R10 definisce le seguenti funzioni da realizzare:
- Aggiunta di una nuova modalità di gioco, chiamata “BossRush”, in cui il giocatore sfida tutti i Robot disponibili, eventualmente, entro un tempo massimo
- Si assuma che ci sia un Robot diverso per ogni coppia Robot+Livello. Esempio: se ci sono 2 livelli del Robot Evosuite, si dovrà presentare ciascun livello come se fosse un Robot diverso
- Ad ogni turno giocato, ovvero ogni sfida contro i Robot, l’applicazione dovrebbe mostrare un messaggio riguardo quanti e quali Robot sono stati battuti con le relative percentuali di copertura

La documentazione completa è disponibile in formato pdf nella repository oppure in formato latex di sola visualizzazione su Overleaf al seguente link https://www.overleaf.com/read/rcqmbjvgdfsy#82cf85
# GUIDA ALL'INSTALLAZIONE

## PASSO 1
Avviare i due script "ricompilazione-T5.bat" e "ricompilazione-T6.bat". Successivamente avviare lo script "installer.bat", saranno effettuate le seguenti operazioni:
1) creazione della rete "global-network" comune a tutti i container
2) creazione del volume "VolumeT9" comune ai Task 1 e 9
3) installazione di ogni singolo container

NOTA: il container relativo al Task 9 ("Progetto-SAD-G19-master") si sospenderà autonomamente dopo l'avvio. Esso viene utilizzato solo per "popolare" il volume "VolumeT9" condiviso con il Task 1.
Al termine dell'installazione avviare tutti i container eventualmente non attivi.

## PASSO 2
Si deve configurare il container "manvsclass-mongo_db-1" seguendo le indicazioni che seguono:
1) posizionarsi all'interno del terminale del container
2) digitare il comando "mongosh"
3) digitare i seguenti comandi:

        use manvsclass
        db.createCollection("ClassUT");
        db.createCollection("interaction");
        db.createCollection("Admin");
        db.createCollection("Operation");
        db.ClassUT.createIndex({ difficulty: 1 })
        db.Interaction.createIndex({ name: "text", type: 1 })
        db.interaction.createIndex({ name: "text" })
        db.Admin.createIndex({username: 1})

## PASSO 3
L'intera applicazione è adesso pienamente configurata e raggiungibile sulla porta :80.

# GUIDA ALL'UTILIZZO
In prima battuta è necessario procedere alla registrazione dell'admin all'URL http://localhost/registraAdmin mediante l'inserimento di alcuni dati, quali: nome, cognome, username, e password. Una volta terminata la registrazione è possibile caricare le classi da testare, in modo tale da procedere all'avvio del gioco.

Successivamente è possibile procedere con la registrazione dell'utente all'URL http://localhost/register, nel caso in cui non si possiedano  ancora le credenziali. In alternativa, è possibile passare direttamente alla fase di login, mediante l'URL http://localhost/register. Durante la registrazione bisogna inserire il proprio nome, cognome, email e password (almeno 8 caratteri, una maiuscola, una minuscola, e un carattere speciale).

Una volta effettuato l'accesso, sarà possibile scegliere la modalità di gioco, ovvero classica o contro tutti i robot. Successivamente si potrà selezionare la classe da testare e, nel caso si sia scelta la modalità classica, anche il robot da sfidare. 
Infine, sarà possibile procedere all'avvio della partita.
# VIDEO DIMOSTRAZIONE
## Video1


https://github.com/Testing-Game-SAD-2023/A6-2024/assets/92026374/5d506742-573b-4214-9e70-84c0b82f8606


## Video2


https://github.com/Testing-Game-SAD-2023/A6-2024/assets/92026374/b38501b7-5d0f-4922-a15a-42f8044791aa


## Video3


https://github.com/Testing-Game-SAD-2023/A6-2024/assets/92026374/b9007cd3-d520-44c9-9929-f6c93e8af6f8

