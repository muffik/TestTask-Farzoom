package Vladimir.The.image.service.repository;

import Vladimir.The.image.service.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

    @Query(value = "SELECT * FROM image i WHERE i.image_id = ?1", nativeQuery = true)
    // возможно ли получить по id коллекцию изображений?
    List<Image> searchImageId(int id);
}
