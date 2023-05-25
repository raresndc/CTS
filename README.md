# CTS

1. Memento

-> se foloseste cand vreau sa accesez stari anterioare (undo, redo)
-> daca am un proces sau o operatie complexa care implica modificari multiple asupra unui obiect
-> restaurarea starii in caz de eroare sau exceptie
-> implementarea functionalitatilor de salvare si incarcare a starii

2. Chain of Responsability

-> se foloseste pentru a se gestiona o secventa de actiuni ce pot procesa un eveniment sau un obiect
-> secvential
-> gestionarea cererilor intr-un sistem de evenimente
-> validarea datelor intr-un flux de procesare
-> filtrarea sau transformarea datelor intr-un sistem de prelucrare
-> tratarea cererilor intr-un sistem de gestionare a erorilor

3. Observer

-> se foloseste atunci cand se executa o actiune atunci cand are loc un eveniment sau un observabil isi schimba starea
-> actualizarea intefretei grafice in functie de starea unui obiect
-> notificarea abonatilor intr-un sistem de evenimente
-> actualizarea datelor intr-o aplicatie distribuita sau sincronizata

4. Command

-> pentru realizarea intarziata a unui eveniment
-> gestionarea comenzilor intr-o interfata utilizator
-> implementarea sistemelor de tranzactii
-> realizarea sistemelor de coada sau planificare a actiunilor

5. State

-> stabileste tipul actiunii in functie de starea obiectului
-> implementarea unei masini de stari
-> implementarea unui comportament variabil in functie de context
-> implementarea automatelor finite

6. Strategy

-> schimba la run-time functia executata
-> diferite metode de sortare
-> calculul preturilor sau al reducerilor intr-un sistem de vanzari
-> algoritmi de cautare
-> procesarea datelor in functie de formate sau de protocoale diferite

7. Template

-> gestioneaza un sablon fix de actiuni
-> implementarea algoritmilor cu pasi comuni
-> realizarea de framework-uri sau biblioteci
-> construirea de modele de procesare in flux
-> implementarea de actiuni intr-un framewoek

8. Adapter

-> adapteaza un API (interfata) la altul
-> adaptarea unie clase existente la o interfata specifica
-> integrarea cu componente sau biblioteci externe
-> realizarea unei tranzitii intre versiuni diferite ale unei interfete
-> refolosirea componentelor existente

9. Proxy

-> intercepteaza apelul unei metode
-> accesul la resurse costisitoare (timp/ resurse)
-> securitate si control de acces
-> cache
-> registrul si  jurnalizarea

10. Composite

-> gestioneaza o ierarhie de obiecte
-> modelarea structurilor ierarhice
-> manipularea de obiecte individuale si grupuri de obeicte
-> implementarea unui arbore de componenta
-> realizarea de structuri de date complexe

11. Decorator

-> atribuie la run-time functionalitate noua unui obiect existent
-> extinderea fucntionalitatii unei clase fara a modifica clasa in sine
-> adaugarea de functionalitati optionale
-> combinatia de mai multe functionalitati
-> flexibilitate in timpul executiei

12. Facade

-> simplifica executia unui scenariu complex
-> simplificarea interactiunii cu un subsistem complex
-> ascunderea detaliilor de implementare
-> simplificarea migrarii sau integrarii cu alte subsisteme
-> crearea unei interfete personalizate pentru un subsistem

13. Flyweight

-> gestioneaza eficient mai multe instante ale unui set redus de modele
-> crearea unui numar mare de obiecte
-> reducerea costului stocarii datelor
-> optimizarea performantei
-> crearea de structuri de date eficiente
