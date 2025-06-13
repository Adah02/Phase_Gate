const prompt = require("prompt-sync")()

function personalityType(introvert, extrovert, sensing, intuitive, thinking, feeling, judging, perception){
	
	let personality = ""

		let energy = (introvert > extrovert) ? (personality += "I") : (personality += "E");
		let mind = (sensing > intuitive) ? (personality += "S") : (personality += "N");
		let nature = (thinking > feeling) ? (personality += "T") : (personality += "F");
		let tactics = (judging > perception) ? (personality += "J") : (personality += "P");
	 
	return personality;
	};

function energyDetails(energy, introvert, extrovert){
		
		let choicesInEnergy = "";

		for (let item in energy){
		choicesInEnergy += console.log(item, "\n");
		}
		choicesInEnergy += console.log("Number of A selected: ", extrovert,"\nNumber of B selected: ", introvert,"\n");
	return choicesInEnergy;
	};

function mindDetails(mind, sensing, intuitive){
		
		let choicesInMind = "";

		for (let item in mind){
		choicesInMind += console.log(item);
		}
		choicesInMind += console.log("Number of A selected: ",intuitive,"\nNumber of B selected: ", sensing,"\n");
	return choicesInMind;
	};

function natureDetails(nature, thinking, feeling){
		
		let choicesInNature = "";

		for (let item in nature){
		choicesInNature += console.log(item);
		}
		choicesInNature += console.log("Number of A selected: ", thinking, "\nNumber of B selected: ", feeling,"\n");
	return choicesInNature;
	};

function tacticsDetails(tactics, judging, perception){
		
		let choicesInTactics = "";

		for (let item in tactics){
		choicesInTactics += console.log(item);
		}
		choicesInTactics += console.log("Number of A selected: ", judging, "\nNumber of B selected: ", perception, "\n");
	return choicesInTactics;
	}

function usersName(myName){

	let refinedName = "";
	for (let index = 0; index < myName.length(); index++){

		if (myName.charAt(index) >= 'a' && myName.charAt(index) <= 'z' || 
		myName.charAt(index) >= 'A' && myName.charAt(index) <= 'Z'){
			if (index > 1 && myName.charAt(index - 1) == ' '){
				refinedName += String.valueOf(myName.charAt(index)).toUpperCase();
			} else { 	refinedName += myName.charAt(index);	
				};
		}else if (myName.charAt(index) == ' ' ){ refinedName += myName.charAt(index);
		} else { myName.replaceAll(String.valueOf(myName.charAt(index)), "");  }
	}
	return refinedName;
	};


function commander(){

	let entj = `
ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.
People with the ENTJ personality type (Commanders) are natural-born leaders. Embodying the gifts of charisma and confidence, ENTJs project authority in a way that draws crowds together behind a common goal. However, these personalities are also characterized by an often ruthless level of rationality, using theirdrive, determination, and sharp mind to achieve whatever objectives they’ve set for themselves. Their intensitymight sometimes rub people the wrong way, but ultimately, ENTJs take pride in both their work ethic and theirimpressive level of self-discipline.
`;
	return entj;
	};

function logician(){

	let intp = `
INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been INTPs. People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their own devices. They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the crowd.
`;
	return intp;
	};

function architect(){

	let intj = `
INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.
People with the INTJ personality type (Architects) are intellectually curious individuals with a deep-seated thirst for knowledge. INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. They consistently work toward enhancing intellectual abilities and are often driven by an intense desire to master any and every topic that piques their interest.
`;
	return intj;
	}
	
function debater(){

		let entp = `
ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.
Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up these personalities more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better. It would be a mistake, though, to think of ENTPs as disagreeable or mean-spirited. Instead, people with this personality type are knowledgeable and curious with a playful sense of humor, and they can be incredibly entertaining. They simply have an offbeat, contrarian idea of fun – one that usually involves a healthy dose of spirited debate.
`;
	return entp;
	};

function adventurer(){

		let isfp = `
ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
People with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional sense. For these types, life itself is a canvas for self-expression. From what they wear to how they spend their free time, they act in ways that vividly reflect who they are as unique individuals. With their exploratory spirit and their ability to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet.
Driven by their sense of fairness and their open-mindedness, people with this personality type move through life with an infectiously encouraging attitude. They love motivating those close to them to follow their passions and usually follow their own interests with the same unhindered enthusiasm. The only irony? Unassuming and humble, ISFPs tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
`;
	return isfp;
	}

function virtuoso(){

		let istp = `
ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.
People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching and examining the world around them with an impressive diligence, a casual curiosity, and a healthy dose of skepticism. They are natural makers, moving from project to project, building the useful and the superfluous for the fun of it and learning from their environment as they go. They find no greater joy than in getting their hands dirty pulling things apart and putting them back together, leaving them just a little bit better than they were before. ISTPs prefer to approach problems directly, seeking straightforward solutions over convoluted troubleshooting methods. 
People with this personality type rely heavily on firsthand experience and trial and error as they execute their ideas and projects. And as they do so, they usually prefer to work at their own pace, on their own terms, and without unnecessary interruptions.
`;
	return istp;
	}

function entrepreneur(){

	let estp = `
ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and spontaneous energy. They tend to be on the competitive side, often assuming that a competitive mindset is a necessity in order to achieve success in life. With their driven, action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at keeping their attention rooted in their present – so much so that they rarely find themselves fixated on the time throughout the day.
Theory, abstract concepts, and plodding discussions about global issues and their implications don’t keep ESTP personalities interested for long. They keep their conversations energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it. They often leap before they look, fixing their mistakes as they go rather than sitting idle and preparing contingencies and escape clauses.
`;
	return estp;
	};

function entertainer(){

	let esfp = `
ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities. If anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP personality type (Entertainers). They get caught up in the excitement of the moment and want everyone else to feel that way too. No other type is as generous with their time and energy when it comes to encouraging others, and no other type does it with such irresistible style.
ESFP personalities are inclined toward putting on a show for others and generally appear to be very comfortable in the spotlight. However, it is not their love for being the center of attention that drives this sense of confidence but their knack for sensing what’s appropriate in certain situations. They have an uncanny ability to mirror the behaviors of those around them. ESFPs truly enjoy the simplest things, and there’s no greater joy for them than just having fun with a good group of friends. People with this personality type would almost always choose to be with friends over spending time alone. With their unique and earthy wit, they love soaking up attention and making every get-together feel a bit like a party.
`;
	return esfp;
	};

function advocate(){

	let infj = `
			INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep 
			thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
			Idealistic and principled, people with the INFJ personality type (Advocates) aren’t content to coast through life – they want to stand up 
			and make a difference. For these compassionate personalities, success doesn’t come from money or status but from seeking fulfillment, 
			helping others, and being a force for good in the world.
			While they have lofty goals and ambitions, INFJs shouldn’t be mistaken for idle dreamers. People with this personality type care about 
			integrity, and they’re rarely satisfied until they’ve done what they know to be right. Conscientious to the core, they move through life 
			with a clear sense of their values, and they aim to never lose sight of what truly matters – not according to other people or society at 
			large but according to their own wisdom and intuition.
			Perhaps because their personality type is so uncommon, INFJs tend to carry around a sense – whether conscious or not – of being 
			different from most people. With their rich inner lives and their deep, abiding desire to find their life purpose, they don’t always fit in 
			with those around them. This isn’t to say that INFJ personalities can’t enjoy social acceptance or close relationships – only that they 
			sometimes feel misunderstood or at odds with the world.
			`;
	return infj;
	}

function mediator(){

	let infp = `
			INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. These rare personality types 
			tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.
			Although they may seem quiet or unassuming, people with the INFP personality type (Mediators) have vibrant, passionate inner 
			lives. Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their 
			mind. INFPs are known for their sensitivity – these personalities can have profound emotional responses to music, art, nature, and 
			the people around them. They are known to be extremely sentimental and nostalgic, often holding onto special keepsakes and
			 memorabilia that brighten their days and fill their heart with joy.
			Idealistic and empathetic, people with the INFP personality type long for deep, soulful relationships, and they feel called to help 
			others. Due to the fast-paced and competitive nature of our society, they may sometimes feel lonely or invisible, adrift in a world 
			that doesn’t seem to appreciate the traits that make them unique. Yet it is precisely because INFPs brim with such rich sensitivity 
			and profound creativity that they possess the unique potential to connect deeply and initiate positive change.
			`;
	return infp;
	}

function protagonist(){

	let enfj = `
			ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. These warm, forthright 
			types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative 
			energy to achieve their goals.
			ENFJs are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and 
			teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, 
			including their relationships. Few things bring people with the ENFJ personality type a deeper sense of joy and fulfillment 
			than guiding friends and loved ones to grow into their best selves.
			ENFJs tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or 
			wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak in 
			ways that resonate with others.
			ENFJ personalities have not only an uncanny ability to pick up on people’s underlying motivations and beliefs but also a knack 
			for understanding how others are feeling just by looking at them. At times, they may not even understand how they come to 
			grasp another person’s mind and heart so quickly. These flashes of insight can make ENFJs incredibly persuasive and inspiring 
			communicators.
			`;
	return enfj;
	}

function campaigner(){

		let enfp = `
			ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. These people 
			tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy 
			can flow in many directions.
			People with the ENFP personality type (Campaigners) are true free spirits – outgoing, openhearted, and open-minded. 
			With their lively, upbeat approach to life, ENFPs stand out in any crowd. But even though they can be the life of the party, 
			they don’t just care about having a good time. These personalities have profound depths that are fueled by their intense 
			desire for meaningful, emotional connections with others.
			ENFP personalities carry an interesting blend of carefree sociability, sparkling imagination, and deep, contemplative 
			introspection. They regularly use their natural curiosity and expansive creativity to try to better understand themselves 
			and the complex dynamics of human relationships. And they are truly devoted to nurturing their relationships with and 
			their understanding of the world at large.
			In their unique way, ENFPs’ introspective nature is driven by their imagination, wonder, and belief in things that cannot 
			always be explained rationally. People with this personality type truly believe that everything – and everyone – is connected, 
			and they live for the glimmers of insight that they can gain from these connections. They believe that how we treat one another 
			really matters. In fact, ENFPs are the most likely personality type to believe in the concept of karma.
			`;
	return enfp;
	};

function logistician(){

		let istj = `
			ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend to be 
			reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical 
			purpose.
			People with the ISTJ personality type (Logisticians) mean what they say and say what they mean, and when they commit to 
			doing something, they make sure to follow through. With their responsible and dependable nature, it might not be so surprising 
			that ISTJ personalities also tend to have a deep respect for structure and tradition. They are often drawn to organizations, 
			workplaces, and educational settings that offer clear hierarchies and expectations.
			While ISTJs may not be particularly flashy or attention seeking, they do more than their share to keep society on a sturdy, stable 
			foundation. In their families and their communities, people with this personality type often earn respect for their reliability, their 
			practicality, and their ability to stay grounded and logical in even the most stressful situations.
			`;
	return istj
	};

function executive(){

		let estj = `
			ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, 
			emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid 
			direction amid adversity.
			People with the ESTJ personality type (Executives) are representatives of tradition and order, utilizing their understanding of 
			what is right, wrong, and socially acceptable to bring families and communities together. Embracing the values of honesty and 
			dedication, ESTJs are valued for their mentorship mindset and their ability to create and follow through on plans in a diligent 
			and efficient manner. They will happily lead the way on difficult paths, and they won’t give up when things become stressful.
			Strong believers in the rule of law and authority that must be earned, ESTJ personalities lead by example, demonstrating 
			dedication and purposeful honesty and an utter rejection of laziness and cheating. If anyone declares hard, manual work to 
			be an excellent way to build character, it’s ESTJs.
			This personality type is aware of their surroundings and lives in a world of clear, verifiable facts. Their surety of their knowledge 
			means that, even against heavy resistance, they stick to their principles and push an unclouded vision of what is and is not 
			acceptable. And their opinions aren’t just empty talk either, as ESTJs are more than willing to dive into the most challenging 
			projects, improving action plans and sorting details along the way, making even the most complicated tasks seem easy and 
			approachable.
			`;
	return estj;
	};

function defender(){

		let isfj = `
			ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be 
			warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical 
			details in their daily lives.
			In their unassuming, understated way, people with the ISFJ personality type (Defenders) help make the world go round. 
			Hardworking and devoted, these personalities feel a deep sense of responsibility to those around them. ISFJs can be 
			counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved 
			ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to 
			operate behind the scenes.
			This is a capable, can-do personality type with a wealth of versatile gifts. Though sensitive and caring, ISFJs also have 
			excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people 
			skills and robust social relationships. These personalities are truly more than the sum of their parts, and their varied 
			strengths shine in even the most ordinary aspects of their daily lives.
			`;
	return isfj;
	};

function consul(){

	let esfj = `
			ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and 
			people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, 
			and they willingly offer guidance to others.
			For people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. These social individuals 
			form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.
			This doesn’t mean that they are saints or that they like everyone. In fact, they are much more likely to form close bonds 
			with people who share their same values and opinions. But regardless of other people’s beliefs, ESFJ personalities still 
			strongly believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around 
			them. Generous and reliable, they often take it upon themselves – in ways both large and small – to hold their families 
			and their communities together.
			People with the ESFJ personality type are altruists. They take seriously their responsibility to give back, serve others, 
			and do the right thing. And they believe that there is a clear right thing to do in nearly every situation. While some 
			personality types adopt a more lenient, live-and-let-live attitude, ESFJs may find it difficult to not judge when someone 
			takes a path that strikes them as misguided. As a result, they often struggle to accept it when someone – particularly 
			someone they care about – disagrees with them or chooses to walk a path that they do not understand.
			`;
	return esfj;
	};

function personalityTrait(){
	let type = personalityType(introvert, extrovert, sensing, intuitive, thinking, feeling, judging, perception);

	let trait = "";
	
		if (type == "ENTJ"){ 	trait = commander()
		} else if (type == "INTP"){	trait = logician()
		} else if (type == "INTJ"){	trait = architect()
		} else if (type == "ENTP"){	trait = debater()
		} else if (type == "ISFP"){	trait = adventurer()
		} else if (type == "ISTP"){	trait = virtuoso()
		} else if (type == "ESTP"){	trait = entrepreneur()
		} else if (type == "ESFP"){	trait = entertainer()
		} else if (type == "INFJ"){	trait = advocate()
		} else if (type == "INFP"){	trait = mediator()
		} else if (type == "ENFJ"){	trait = protagonist()
		} else if (type == "ENFP"){	trait = campaigner()
		} else if (type == "ISTJ"){	trait = logistician()
		} else if (type == "ESTJ"){	trait = executive()
		} else if (type == "ISFJ"){	trait = defender()
		} else if (type == "ESFJ"){	trait = consul()  
		};

	return trait;
	};

let myName = prompt("what is your name? : ");

let a = [ "A. Comfortable with walking to someone to start conversations", 
		"A. Not moved by past mistakes",
		"A. Prioritizes facts in the course of actions",
		"A. Often compare efforts to others",
		"A. Very productive in team work", 
		"A. Not worried of making impressions", 
		"A. Not worried of things taking negative turns",
		"A. Base choices on objectives",
		"A. Loud and outgoing",
		"A. Authority over honesty",
		"A. Prioritizes proving points over feelings",
		"A. Empathical and accommodating",
		"A. Enjoy networking and promoting yourself around people",
		"A. Work according to schedule",
		"A. Love eploring unfamiliar ideas & viewpoints",
		"A. Complete task before deadline",
		"A. Not observant",
		"A. Do chores before relaxation",
		"A. Highly unstable under pressure",
		"A. Overly interested in discussing with others"];

let b = ["B. Love being by yourself always", 
		"B. Little mistakes causes doubt in your abilities",
		"B. Allow feelings drive decision makings",
		"B. Not bothered by efforts of others",
		"B. Highly productive alone", 
		"B. Prioritizes making good impressions",
		"B. Worried for negative outcomes",
		"B. Do things based on emotional impressions",
		"B. Lonely and indoor lifestyle",
		"B. Honesty over other things",
		"B. Considers effects of decisions on others",
		"B. Logical and questioning",
		"B. Enjoy solitary hobbies and activities",
		"B. Work without actual plan",
		"B. Work on pre-existing inventions",
		"B. Abandon complex tasks",
		"B. A good listener & highly observant",
		"B. Allow things come in the way",
		"B. Stay calm under pressure",
		"B. Not interested in discussions" ];

	let energy = [];
	let mind = [];
	let nature = [];
	let tactics = [];
	
	let introvert = 0;   let extrovert = 0; 		let sensing = 0;   let intuitive = 0;
	let thinking = 0; 	let feeling = 0;		let judging = 0;   let perception = 0;

	for (let index = 0; index < 20; index++){
		let optionA = (a[index]);		 let optionB = (b[index])
		
		let options = true;
		while (options == true){
		console.log( index + 1,".", optionA, "   " , optionB);
		let choice = prompt("Choose option A or B: ");

		if (choice == "a"){
			options = false;
		} else if (choice == "b"){
			options = false;
		} else {
				console.log("Enter a valid option")
				options = true;
				}
		if (optionA == (a[0])  && choice == "a" || optionA == (a[4])  && choice == "a" ||
		optionA == (a[8])  && choice == "a" || optionA == (a[12])  && choice == "a" || 
		optionA == (a[16])  && choice == "a"){  extrovert += 1;  energy.push(optionA)
			} 
		else if (optionA == (a[0])  && choice == "b" || optionA == (a[4])  && choice == "b" ||
		optionA == (a[8])  && choice == "b" || optionA == (a[12])  && choice == "b" || 
		optionA == (a[16])  && choice == "b"){ introvert += 1;  energy.push(optionB);	};


		if (optionA == (a[1])  && choice == "a" || optionA == (a[5])  && choice == "a" ||
		optionA == (a[9])  && choice == "a" || optionA == (a[13])  && choice == "a" || 
		optionA == (a[17])  && choice == "a"){  intuitive += 1;	mind.push(optionA)	
			} 
		else if (optionA == (a[1])  && choice == "b" || optionA == (a[5])  && choice == "b" ||
		optionA == (a[9])  && choice == "b" || optionA == (a[13])  && choice == "b" || 
		optionA == (a[17])  && choice == "b"){  sensing += 1; 	mind.push(optionB) 	};


		if (optionA == (a[2])  && choice == "a" || optionA == (a[6])  && choice == "a" ||
		optionA == (a[10])  && choice == "a" || optionA == (a[14])  && choice == "a" || 
		optionA == (a[18])  && choice == "a"){  thinking += 1;	nature.push(optionA);
			} else if (optionA == (a[2])  && choice == "b" || optionA == (a[6])  && choice == "b" ||
		optionA == (a[10])  && choice == "b" || optionA == (a[14])  && choice == "b" || 
		optionA == (a[18])  && choice == "b"){ feeling += 1;	nature.push(optionB);	}


		if (optionA == (a[3])  && choice == "a" || optionA == (a[7])  && choice == "a" ||
		optionA == (a[11])  && choice == "a" || optionA == (a[15])  && choice == "a" || 
		optionA == (a[19])  && choice == "a"){  judging += 1;	tactics.push(optionA);
			} else if (optionA == (a[3])  && choice == "b" || optionA == (a[7])  && choice == "b" ||
		optionA == (a[11])  && choice == "b" || optionA == (a[15])  && choice == "b" || 
		optionA == (a[19])  && choice == "b"){ perception += 1;	tactics.push(optionB);	}
			}
		};

	let choicesInEnergy = console.log("Number of A selected: ",extrovert, "\n", "Number of B selected: ", introvert, "\n");
	let choicesInMind = console.log("Number of A selected: ", intuitive, "\n" , "Number of B selected: ", sensing, "\n");
	let choicesInNature = console.log("Number of A selected: ", thinking, "\n", "Number of B selected: ", feeling, "\n");
	let choicesInTactics = console.log("Number of A selected: ", judging, "\n", "Number of B selected: ", perception, "\n");
	

	console.log("\n Hello", myName ,"you selected the following;- \n");
	console.log(energyDetails(energy, introvert, extrovert));
	console.log(mindDetails(mind, sensing, intuitive));
	console.log(natureDetails(nature, thinking, feeling));
	console.log(tacticsDetails(tactics, judging, perception));
	console.log("Your PersonalityType: ", personalityType(introvert,  extrovert, sensing, intuitive, thinking, feeling, judging, perception), "\n");
	console.log(personalityTrait());

