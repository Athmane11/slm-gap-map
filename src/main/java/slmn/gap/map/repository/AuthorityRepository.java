package slmn.gap.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import slmn.gap.map.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
