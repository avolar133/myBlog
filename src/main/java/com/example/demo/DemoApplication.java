package com.example.demo;

import com.example.demo.domain.Post;
import com.example.demo.domain.Subscriber;
import com.example.demo.repositories.PostRepository;
import com.example.demo.repositories.SubscriberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		/**String url = "";
		String user;
		String password;
		Connection myConnection = DriverManager(url,user,password);
		**/
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(SubscriberRepository repository, PostRepository postRepository){
		return args -> {
			repository.save( new Subscriber("Michael", "Yaroshevsky", "mi@goo.com"));
			repository.save( new Subscriber("rita", "gromyko", "ri@goo.com"));

			Date date = new Date(System.currentTimeMillis());
			postRepository.save( new Post("Michael",date,"שייקספיר מאוהב (גבינת פאלטרו), נני מקפי – קסם של אומנת (אמה תומפסון), הענק הירוק (אדוארד נורטון), קח את זה כמו גבר (ג'ייסון סיגל, קריסטן בל), מודלים לחיקוי (פול ראד), לחלום אותך (רובין וויליאמס), פאטץ' אדאמס (רובין וויליאמס), 8 מייל (אמינם), אמריקן גנגסטר (דנזל וושינגטון), זה סיפור קצת מצחיק (זאק גליפיאנאקיס), קספר, חטיפה בים הצפוני (Ffolkes עם רוג'ר מור, 1980), יריד ההבלים (ריס ווית'רספון), ילדת פרא (אמה רוברטס), הארי וההנדרסונים (ג'ון לית'גו), בין: הסרט (רואן אטקינסון), הלבוי 2: צבא הזהב, הופ הארנב."));
			postRepository.save( new Post("rita",date,"asdffffffffffffffffffffffffffffffffffffffffffffasfffffffffffffffffff"));
			postRepository.save( new Post("rita",date,"The Crafting of Chess הוא ספר שהוא גם מודרני וגם לא מודרני בעת ובעונה אחת.\n" +
					"\n" +
					"נתחיל מהמודרניות: הוא יצא בפברואר 2019, ומשתייך מאד’אנר הסופר-חדש: GameLit: ספרי מדע בדיוני שמתרחשים בתוך משחק מחשב (כבר אסביר מה זה אומר).\n" +
					"\n" +
					"מצד שני, GameLit הוא ז’אנר עם מאפיינים מאד לא מודרניים. הסיפורים מתמקדים בגברים ובעולמם, כשאחד המאפיינים הנפוצים הוא גיבור עם לפחות שלוש חברות.\n" +
					"\n" +
					"The Crafting of Chess לא נופל למלכודת ההרמון: הוא נטול סקס או מערכות יחסים לגמרי, וממש מתמקד בצד הסיפורי. מצד שני, רוב הדמויות בו גבריות, וגם אם הוא טכנית לא נכשל במבחן בקדל, הוא מקבל בו את הציון “עובר בקושי”. לצערי, צריך להתעלם מזה כדי להינות ממה שכן יש לספר להציע, וזה הרבה."));



			postRepository.save( new Post("molly",date,"The Crafting of Chess הוא ספר שהוא גם מודרני וגם לא מודרני בעת ובעונה אחת.\n" +
					"\n" +
					"נתחיל מהמודרניות: הוא יצא בפברואר 2019, ומשתייך מאד’אנר הסופר-חדש: GameLit: ספרי מדע בדיוני שמתרחשים בתוך משחק מחשב (כבר אסביר מה זה אומר).\n" +
					"\n" +
					"מצד שני, GameLit הוא ז’אנר עם מאפיינים מאד לא מודרניים. הסיפורים מתמקדים בגברים ובעולמם, כשאחד המאפיינים הנפוצים הוא גיבור עם לפחות שלוש חברות.\n" +
					"\n" +
					"The Crafting of Chess לא נופל למלכודת ההרמון: הוא נטול סקס או מערכות יחסים לגמרי, וממש מתמקד בצד הסיפורי. מצד שני, רוב הדמויות בו גבריות, וגם אם הוא טכנית לא נכשל במבחן בקדל, הוא מקבל בו את הציון “עובר בקושי”. לצערי, צריך להתעלם מזה כדי להינות ממה שכן יש לספר להציע, וזה הרבה."));



		};
	}
}
