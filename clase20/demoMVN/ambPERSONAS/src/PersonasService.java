public class PersonasService {

    @Respository
    class{
        @PersistenceContext
        private EntityManager em;

        @Transactional
        public void guardad(Persona p){
            em.persist(p)
        }


        public Persona consultar(int documento){
            return em.find(Persona.class, documento);}
|
        public Colection<Persona> consultarTodas(){
            return em.createQuery("select * from Persona p", Persona.class).getResultList();
        }

        @Transactional
        public void borrar(int)
}
