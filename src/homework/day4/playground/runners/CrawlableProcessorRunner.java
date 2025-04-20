package homework.day4.playground.runners;

import homework.day4.playground.essence.creatures.*;
import homework.day4.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor processor4 = new CrawlableProcessor();
        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };
        processor4.runCrawlable(crawlableCrocodile);
        processor4.runCrawlable(crawlableBeetle);
        processor4.runCrawlable((Crawlable) vertebrataCrocodile);
        processor4.runCrawlable((Crawlable) insectBeetle);
        processor4.runCrawlable(aCrocodile);
        processor4.runCrawlable(aBeetle);
        processor4.runCrawlable(anonymousCrawlable);
        processor4.runCrawlable(aCrocodile, "налево");
        processor4.runCrawlable(crawlableBeetle, "никуда");
        processor4.runCrawlable(aCrocodile, "назад", 37);
        processor4.runCrawlable(new Crawlable () {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                String a = "вниз";
                int b = 37;
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, a, b);
            }
        });
    }
}
