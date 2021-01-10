package rs.ac.uns.ftn.ktsnvt.kultura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rs.ac.uns.ftn.ktsnvt.kultura.model.CulturalOfferingMainPhoto;
import rs.ac.uns.ftn.ktsnvt.kultura.model.ReviewPhoto;

import java.util.List;

public interface ReviewPhotoRepository extends JpaRepository<ReviewPhoto, Long> {
    @Query("select p from ReviewPhoto p where p.review is null and p.token = :token")
    List<ReviewPhoto> getNullOffering(String token);

    List<ReviewPhoto> getAllByReviewId(long reviewId);
}