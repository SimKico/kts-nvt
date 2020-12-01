package rs.ac.uns.ftn.ktsnvt.kultura.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.ac.uns.ftn.ktsnvt.kultura.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.ktsnvt.kultura.model.Post;

import java.util.UUID;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, UUID> {
    Page<Photo> findAllByCulturalOfferingId(UUID culturalOfferingId, Pageable p);

}