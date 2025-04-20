package homework.day4.playground.processors;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.utils.DirectionGenerator;
import homework.day4.playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable (Crawlable crawlable){
        String direction = DirectionGenerator.generateDirection();
        int distance = DistanceGenerator.generateDistance();
        crawlable.crawl(direction, distance);
    }
    public void runCrawlable (Crawlable crawlable, String direction){
        int distance = DistanceGenerator.generateDistance(); //почему без стринг строки не ругается, а без этой ругается
        crawlable.crawl(direction, distance);
    }
    public void runCrawlable (Crawlable crawlable, String direction, int distance){
        crawlable.crawl(direction, distance);
    }
}
