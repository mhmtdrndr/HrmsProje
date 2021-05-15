package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
	
	private JobTitleService JobTitleService;	
	
	@Autowired
	public JobTitlesController(kodlamaio.hrms.business.abstracts.JobTitleService jobTitleService) {
		super();
		JobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.JobTitleService.getAll();		
	}
}
