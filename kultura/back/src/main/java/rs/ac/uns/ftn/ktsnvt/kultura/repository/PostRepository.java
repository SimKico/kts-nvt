package rs.ac.uns.ftn.ktsnvt.kultura.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.ac.uns.ftn.ktsnvt.kultura.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Page<Post> findAllByCulturalOfferingId(long culturalOfferingId, Pageable p);
}
