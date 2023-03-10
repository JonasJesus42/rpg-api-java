import com.rpg.dto.StatsDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatsService statsService;

    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatsDto> getById(@PathVariable Long id) {
        StatsDto statsDTO = statsService.getById(id);
        return ResponseEntity.ok(statsDTO);
    }

    @PostMapping
    public ResponseEntity<StatsDto> create(@RequestBody @Valid StatsDto statsDTO) {
        StatsDto createdStatsDTO = statsService.create(statsDTO);
        return ResponseEntity.created(URI.create("/stats/" + createdStatsDTO.getId())).body(createdStatsDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StatsDto> update(@PathVariable Long id, @RequestBody @Valid StatsDto statsDTO) {
        StatsDto.setId(id);
        StatsDto updatedStatsDTO = statsService.update(statsDTO);
        return ResponseEntity.ok(updatedStatsDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        statsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}