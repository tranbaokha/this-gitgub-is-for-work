package all.things.in.springboot.ADocumentForSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository <PostEntity, Integer>{
	
}
