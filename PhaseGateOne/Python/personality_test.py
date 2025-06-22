def personality_type(introvert, extrovert, sensing, intuitive, thinking, feeling, judging, perception):
	
	personality = ""
	if introvert > extrovert:
		personality += "I"
	else:
		personality += "E"

	if sensing > intuitive:
		personality += "S"
	else:
		personality += "N"

	if thinking > feeling:
		personality += "T"
	else:
		personality += "F"

	if judging > perception:
		personality += "J"
	else:
		personality += "P"
	 
	return personality


def energy_details(energy, introvert, extrovert):
	choices_in_energy = ""

	for item in energy:
		choices_in_energy += item + "\n"
	choices_in_energy += f"Number of A selected: {extrovert} \nNumber of B selected: {introvert}\n"

	return choices_in_energy

def mind_details(mind, sensing, intuitive):
		
	choices_in_mind = ""

	for item in mind:
		choices_in_mind += f"{item}\n"
	
	choices_in_mind += f"Number of A selected: {intuitive} \nNumber of B selected: {sensing}\n"

	return choices_in_mind


def nature_details(nature, thinking, feeling):
	choices_in_nature = ""

	for item in nature:
		choices_in_nature += item + "\n"
	choices_in_nature += f"Number of A selected: {thinking} \nNumber of B selected: {feeling}\n"

	return choices_in_nature


def tactics_details(tactics, judging, perception):
	choices_in_tactics = ""

	for item in tactics:
		choices_in_tactics += item + "\n"

	choices_in_tactics += f"Number of A selected: {judging}\nNumber of B selected: {perception}\n"

	return choices_in_tactics


def commander():
	entj = '''
	ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and
	Judging traits. They are decisive people who love momentum and accomplishment. 
	They gather information to construct their creative visions but rarely hesitate for long 
	before acting on them.
	People with the ENTJ personality type (Commanders) are natural-born leaders. 
	Embodying the gifts of charisma and confidence, ENTJs project authority in a way that 
	draws crowds together behind a common goal. However, these personalities are also 
	characterized by an often ruthless level of rationality, using theirdrive, determination, 
	and sharp mind to achieve whatever objectives they’ve set for themselves. Their 
	intensitymight sometimes rub people the wrong way, but ultimately, ENTJs take pride 
	in both their work ethic and theirimpressive level of self-discipline.
	'''
	return entj


def logician():
	intp = '''
	INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting 
	traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. 
	They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
	People with the INTP personality type (Logicians) pride themselves on their unique perspective 
	and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may 
	explain why some of the most influential philosophers and scientists of all time have been INTPs. 
	People with this personality type tend to prefer solitude, as they can easily become immersed in 
	their thoughts when they are left to their own devices. They are also incredibly creative and 
	inventive, and they are not afraid to express their novel ways of thinking or to stand out from 
	the crowd.
	'''
	return intp

def architect():
	intj = '''
	INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. 
	These thoughtful tacticians love perfecting the details of life, applying creativity and rationality 
	to everything they do. Their inner world is often a private, complex one.
	People with the INTJ personality type (Architects) are intellectually curious individuals with a 
	deep-seated thirst for knowledge. INTJs tend to value creative ingenuity, straightforward ration-
	ality, and self-improvement. They consistently work toward enhancing intellectual abilities and 
	are often driven by an intense desire to master any and every topic that piques their interest.
	'''
	return intj

	
def debater():
	entp = '''
	ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting 
	traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental 
	agility. They pursue their goals vigorously despite any resistance they might encounter.
	Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to 
	disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or 
	anyone. Few things light up these personalities more than a bit of verbal sparring – and if the 
	conversation veers into controversial terrain, so much the better. It would be a mistake, though, 
	to think of ENTPs as disagreeable or mean-spirited. Instead, people with this personality type are 
	knowledgeable and curious with a playful sense of humor, and they can be incredibly entertaining. 
	'''
	return entp

def adventurer():
	isfp = '''
	ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting 
	traits. They tend to have open minds, approaching life, new experiences, and people with grounded 
	warmth. Their ability to stay in the moment helps them uncover exciting potentials.
	People with the ISFP personality type (Adventurers) are true artists – although not necessarily in
	 the conventional sense. For these types, life itself is a canvas for self-expression. From what they 
	wear to how they spend their free time, they act in ways that vividly reflect who they are as unique 
	individuals. With their exploratory spirit and their ability to find joy in everyday life, ISFPs can be 
	among the most interesting people you’ll ever meet.
	'''
	return isfp

def virtuoso():
	istp = '''
	ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. 
	They tend to have an individualistic mindset, pursuing goals without needing much external connection. 
	They engage in life with inquisitiveness and personal skill, varying their approach as needed.
	People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching 
	and examining the world around them with an impressive diligence, a casual curiosity, and a healthy dose 
	of skepticism. They are natural makers, moving from project to project, building the useful and the super-
	fluous for the fun of it and learning from their environment as they go. They find no greater joy than in 
	getting their hands dirty pulling things apart and putting them back together, leaving them just a little bit 
	better than they were before. ISTPs prefer to approach problems directly, seeking straightforward solutions 
	over convoluted troubleshooting methods. 
	'''
	return istp


def entrepreneur():
	estp = '''
	ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and 
	Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever 
	is in front of them. They love uncovering life’s opportunities, whether socializing with others 
	or in more personal pursuits.
	People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with 
	an enthusiastic and spontaneous energy. They tend to be on the competitive side, often assuming 
	that a competitive mindset is a necessity in order to achieve success in life. With their driven, 
	action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at 
	keeping their attention rooted in their present – so much so that they rarely find themselves 
	fixated on the time throughout the day.
	'''
	return estp


def entertainer():
	esfp = '''
	ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting 
	traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in 
	discovering the unknown. They can be very social, often encouraging others into shared activities.
	If anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP 
	personality type (Entertainers). They get caught up in the excitement of the moment and want 
	everyone else to feel that way too. No other type is as generous with their time and energy when 
	it comes to encouraging others, and no other type does it with such irresistible style.
	ESFP personalities are inclined toward putting on a show for others and generally appear to be 
	very comfortable in the spotlight. However, it is not their love for being the center of attention that 
	drives this sense of confidence but their knack for sensing what’s appropriate in certain situations. 
	'''
	return esfp


def advocate():
	infj = '''
	INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. 
	They tend to approach life with deep thoughtfulness and imagination. Their inner vision, 
	personal values, and a quiet, principled version of humanism guide them in all things.Idealistic 
	and principled, people with the INFJ personality type (Advocates) aren’t content to coast through 
	life – they want to stand up and make a difference. For these compassionate personalities, success 
	doesn’t come from money or status but from seeking fulfillment, helping others, and being a force 
	for good in the world. 
	While they have lofty goals and ambitions, INFJs shouldn’t be mistaken for idle dreamers. People 
	with this personality type care about integrity, and they’re rarely satisfied until they’ve done what 
	they know to be right. 
	'''
	return infj

def mediator():
	infp = '''
	INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and 
	Prospecting traits. These rare personality types tend to be quiet, open-minded, 
	and imaginative, and they apply a caring and creative approach to everything they 
	do. Although they may seem quiet or unassuming, people with the INFP personality 
	type (Mediators) have vibrant, passionate inner lives. Creative and imaginative, they 
	happily lose themselves in daydreams, inventing all sorts of stories and conversations 
	in their mind. INFPs are known for their sensitivity – these personalities can have 
	profound emotional responses to music, art, nature, and the people around them. 
	They are known to be extremely sentimental and nostalgic, often holding onto special 
	keepsakes and memorabilia that brighten their days and fill their heart with joy.
	'''
	return infp

def protagonist():

	enfj = '''
	ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and
	Judging traits. These warm, forthright types love helping others, and they tend to have 
	strong ideas and values. They back their perspective with the creative energy to achieve 
	their goals. ENFJs are born leaders, which explains why these personalities can be found 
	among many notable politicians, coaches, and teachers. Their passion and charisma allow 
	them to inspire others not just in their careers but in every arena of their lives, including 
	their relationships. Few things bring people with the ENFJ personality type a deeper sense 
	of joy and fulfillment than guiding friends and loved ones to grow into their best selves.
	'''
	return enfj

def campaigner():

	enfp = '''
	ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and 
	Prospecting traits. These people tend to embrace big ideas and actions that reflect their 
	sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.
	People with the ENFP personality type (Campaigners) are true free spirits – outgoing, 
	openhearted, and open-minded. With their lively, upbeat approach to life, ENFPs stand out 
	in any crowd. But even though they can be the life of the party, they don’t just care about 
	having a good time. These personalities have profound depths that are fueled by their intense 
	desire for meaningful, emotional connections with others.
	'''
	return enfp

def logistician():
	istj = '''
	ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, 
	and Judging traits. These people tend to be reserved yet willful, with a rational 
	outlook on life. They compose their actions carefully and carry them out with 
	methodical purpose.
	People with the ISTJ personality type (Logisticians) mean what they say and say 
	what they mean, and when they commit to doing something, they make sure to 
	follow through. With their responsible and dependable nature, it might not be so 
	surprising that ISTJ personalities also tend to have a deep respect for structure 
	and tradition. They are often drawn to organizations, workplaces, and educational 
	settings that offer clear hierarchies and expectations.
	'''
	return istj

def executive():
	estj = '''
	ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and 
	Judging traits. They possess great fortitude, emphatically following their own sensible 
	judgment. They often serve as a stabilizing force among others, able to offer solid 
	direction amid adversity.
	People with the ESTJ personality type (Executives) are representatives of tradition and 
	order, utilizing their understanding of what is right, wrong, and socially acceptable to 
	bring families and communities together. Embracing the values of honesty and dedication, 
	ESTJs are valued for their mentorship mindset and their ability to create and follow through 
	on plans in a diligent and efficient manner. They will happily lead the way on difficult paths, 
	and they won’t give up when things become stressful.
	'''
	return estj

def defender():
	isfj = '''
	ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging 
	traits. These people tend to be warm and unassuming in their own steady way. They’re 
	efficient and responsible, giving careful attention to practical details in their daily lives.
	In their unassuming, understated way, people with the ISFJ personality type (Defenders) 
	help make the world go round. 
	Hardworking and devoted, these personalities feel a deep sense of responsibility to those 
	around them. ISFJs can be counted on to meet deadlines, remember birthdays and special 
	occasions, uphold traditions, and shower their loved ones with gestures of care and support. 
	But they rarely demand recognition for all that they do, preferring instead to operate behind 
	the scenes.
	'''
	return isfj


def consul():
	esfj = '''
	ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. 
	They are attentive and people-focused, and they enjoy taking part in their social community. 
	Their achievements are guided by decisive values, and they willingly offer guidance to others.
	For people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. 
	These social individuals form the bedrock of many communities, opening their homes – and their 
	hearts – to friends, loved ones, and neighbors.
	This doesn’t mean that they are saints or that they like everyone. In fact, they are much more likely
	 to form close bonds with people who share their same values and opinions. But regardless of other 
	people’s beliefs, ESFJ personalities still strongly believe in the power of hospitality and good manners, 
	and they tend to feel a sense of duty to those around them. 
	'''
	return esfj

def personality_trait():
	type = personality_type(introvert, extrovert, sensing, intuitive, thinking, feeling, judging, perception)

	trait = ""
	if type == "ENTJ":
		trait = commander()
	elif type == "INTP":
		trait = logician()
	elif type == "INTJ":
		trait = architect()
	elif type == "ENTP":
		trait = debater()
	elif type == "ISFP":
		trait = adventurer()
	elif type == "ISTP":
		trait = virtuoso()
	elif type == "ESTP":
		trait = entrepreneur()
	elif type == "ESFP":
		trait = entertainer()
	elif type == "INFJ":
		trait = advocate()
	elif type == "INFP":
		trait = mediator()
	elif type == "ENFJ":
		trait = protagonist()
	elif type == "ENFP":
		trait = campaigner()
	elif type == "ISTJ":
		trait = logistician()
	elif type == "ESTJ":
		trait = executive()
	elif type == "ISFJ":
		trait = defender()
	elif type == "ESFJ":
		trait = consul()

	return trait


myName = input("what is your name? : ")

choiceA = ["A. Comfortable with walking to someone to start conversations",
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
		"A. Love eploring unfamiliar ideas and viewpoints",
		"A. Complete task before deadline",
		"A. Not observant",
		"A. Do chores before relaxation",
		"A. Highly unstable under pressure",
		"A. Overly interested in discussing with others"]

choiceB = [ "B. Love being by yourself always",
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
		"B. Not interested in discussions" ]

energy = []
mind = []
nature = []
tactics = []

introvert = 0;   extrovert = 0; 		sensing = 0;   intuitive = 0
thinking = 0; 	feeling = 0;		judging = 0;    perception = 0

for index in range(len(choiceA)):
	optionA = (choiceA[index]);		 optionB = (choiceB[index])

	options = True
	while options != False:
		print(f"{index + 1}. \t{optionA} \t{optionB}")
		choice = str(input("Choose option A or B: "))

		if choice == "a":
			options = False
		elif choice == "b":
			options = False
		else:
			print("Enter a valid option")
			options = True

		if optionA == choiceA[0] and choice.lower() == "a":
			extrovert += 1;  energy.append(optionA)
		elif optionA == (choiceA[4]) and choice.lower() == "a":
			extrovert += 1; energy.append(optionA)
		elif optionA == (choiceA[8]) and choice.lower() == "a":
			extrovert += 1;  energy.append(optionA)
		elif optionA == (choiceA[12]) and choice.lower() == "a":
			extrovert += 1; energy.append(optionA)
		elif optionA == (choiceA[16]) and choice.lower() == "a":
			extrovert += 1; energy.append(optionA)
		elif optionA == (choiceA[0]) and choice.lower() == "b":
			introvert += 1; energy.append(optionB)
		elif optionA == (choiceA[4]) and choice.lower() == "b":
			introvert += 1; energy.append(optionB)
		elif optionA == (choiceA[8]) and choice.lower() == "b":
			introvert += 1; energy.append(optionB)
		elif optionA == (choiceA[12])  and choice.lower() == "b":
			introvert += 1; energy.append(optionB)
		elif optionA == (choiceA[16])  and choice.lower() == "b":
			introvert += 1;  energy.append(optionB)


		if optionA == (choiceA[1]) and choice.lower() == "a":
			intuitive += 1; mind.append(optionA)
		elif optionA == (choiceA[5]) and choice.lower() == "a":
			intuitive += 1;  mind.append(optionA)
		elif optionA == (choiceA[9]) and choice.lower() == "a":
			intuitive += 1;  mind.append(optionA)
		elif optionA == (choiceA[13]) and choice.lower() == "a":
			intuitive += 1;  mind.append(optionA)
		elif optionA == (choiceA[17]) and choice.lower() == "a":
			intuitive += 1;	mind.append(optionA)
		elif optionA == (choiceA[1]) and choice.lower() == "b":
			sensing += 1;  mind.append(optionB)
		elif optionA == (choiceA[5]) and choice.lower() == "b":
			sensing += 1; mind.append(optionB)
		elif optionA == (choiceA[9]) and choice.lower() == "b":
			sensing += 1;  mind.append(optionB)
		elif optionA == (choiceA[13]) and choice.lower() == "b":
			sensing += 1;  mind.append(optionB)
		elif optionA == (choiceA[17])  and choice.lower() == "b":
			sensing += 1; 	mind.append(optionB)


		if optionA == (choiceA[2]) and choice.lower() == "a":
			thinking += 1;  nature.append(optionA)
		elif optionA == (choiceA[6]) and choice.lower() == "a":
			thinking += 1;  nature.append(optionA)
		elif optionA == (choiceA[10]) and choice.lower() == "a":
			thinking += 1;  nature.append(optionA)
		elif optionA == (choiceA[14]) and choice.lower() == "a":
			thinking += 1; nature.append(optionA)
		elif optionA == (choiceA[18]) and choice.lower() == "a":
			thinking += 1;	nature.append(optionA)
		elif optionA == (choiceA[2])  and choice.lower() == "b":
			feeling += 1; nature.append(optionB)
		elif optionA == (choiceA[6])  and choice.lower() == "b":
			feeling += 1; nature.append(optionB)
		elif optionA == (choiceA[10])  and choice.lower() == "b":
			feeling += 1; nature.append(optionB)
		elif optionA == (choiceA[14])  and choice.lower() == "b":
			feeling += 1; nature.append(optionB)
		elif optionA == (choiceA[18])  and choice.lower() == "b":
			feeling += 1;	nature.append(optionB)


		if optionA == (choiceA[3]) and choice.lower() == "a":
			judging += 1;    tactics.append(optionA)
		elif optionA == (choiceA[7]) and choice.lower() == "a":
			judging += 1;    tactics.append(optionA)
		elif optionA == (choiceA[11]) and choice.lower() == "a":
			judging += 1;  tactics.append(optionA)
		elif optionA == (choiceA[15]) and choice.lower() == "a":
			judging += 1;  tactics.append(optionA)
		elif optionA == (choiceA[19]) and choice.lower() == "a":
			judging += 1;	tactics.append(optionA)
		elif optionA == (choiceA[3])  and choice.lower() == "b":
			perception += 1;  tactics.append(optionB)
		elif optionA == (choiceA[7])  and choice.lower() == "b":
			perception += 1;  tactics.append(optionB)
		elif optionA == (choiceA[11])  and choice.lower() == "b":
			perception += 1;  tactics.append(optionB)
		elif optionA == (choiceA[15])  and choice.lower() == "b":
			perception += 1;  tactics.append(optionB)
		elif optionA == (choiceA[19])  and choice.lower() == "b":
			perception += 1;	tactics.append(optionB)

choices_in_energy = f"Number of A selected: {extrovert} \nNumber of B selected: {introvert}\n"
choices_in_mind = f"Number of A selected: {intuitive} \nNumber of B selected: {sensing}\n"
choices_in_nature = f"Number of A selected: {thinking} \nNumber of B selected: {feeling}\n"
choices_in_tactics = f"Number of A selected: {judging} \nNumber of B selected: {perception}\n"
	
print(f"\n Hello {myName} you selected the following;- \n")
print(energy_details(energy, introvert, extrovert))
print(mind_details(mind, sensing, intuitive))
print(nature_details(nature, thinking, feeling))
print(tactics_details(tactics, judging, perception))
print(f"Your Personality Type: {personality_type(introvert, extrovert, sensing, intuitive, thinking, feeling, judging, perception)}")
print(personality_trait())