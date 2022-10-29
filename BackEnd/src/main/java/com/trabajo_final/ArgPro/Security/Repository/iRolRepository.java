package com.trabajo_final.ArgPro.Security.Repository;

import com.trabajo_final.ArgPro.Security.Entity.Rol;
import com.trabajo_final.ArgPro.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}