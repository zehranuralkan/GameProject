package Abstracts;

import Entities.Campaign;

public interface CampaignService {
//ekleme
	void add(Campaign campaign);
//gŁncelleme
	void update(Campaign campaign);
//silme
	void delete(Campaign campaign);
}
