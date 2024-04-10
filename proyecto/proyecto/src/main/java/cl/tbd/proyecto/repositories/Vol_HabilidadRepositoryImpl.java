package cl.tbd.proyecto.repositories;

import cl.tbd.proyecto.entities.Vol_HabilidadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Repository
public class Vol_HabilidadRepositoryImpl implements Vol_HabilidadRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public List<Vol_HabilidadEntity> findAll() {
        try (Connection connection = sql2o.open()) {
            String query = "SELECT * FROM vol_habilidad";
            return connection.createQuery(query).executeAndFetch(Vol_HabilidadEntity.class);
        }
    }

    @Override
    public Vol_HabilidadEntity findById(Long id_vol_habilidad) {
        String sqlQuery = "SELECT * FROM vol_habilidad WHERE id_vol_habilidad = :id_vol_habilidad";
        try (Connection con = sql2o.open()) {
            return con.createQuery(sqlQuery)
                    .addParameter("id_vol_habilidad", id_vol_habilidad)
                    .executeAndFetchFirst(Vol_HabilidadEntity.class);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }

    @Override
    public void create(Vol_HabilidadEntity vol_habilidad) {

    }

    @Override
    public void update(Vol_HabilidadEntity vol_habilidad) {

    }

    @Override
    public void delete(Long id) {

    }
}
