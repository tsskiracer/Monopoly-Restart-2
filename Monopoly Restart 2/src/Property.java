import java.util.ArrayList;

public class Property
	{
		private String name;
		private int cost;
		private int rent;
		private int housePrice;
		private int hr1;
		private int hr2;
		private int hr3;
		private int hr4;
		private int hotelCost;
		private int hotelRent;
		static ArrayList<Property> position = new ArrayList<Property>();

		public Property(String n, int c, int r, int hP, int h1, int h2, int h3, int h4, int hC, int hR)
			{
				name = n;
				cost = c;
				rent = r;
				housePrice = hP;
				hr1 = h1;
				hr2 = h2;
				hr3 = h3;
				hr4 = h4;
				hotelCost = hC;
				hotelRent = hR;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getCost()
			{
				return cost;
			}

		public void setCost(int cost)
			{
				this.cost = cost;
			}

		public int getRent()
			{
				return rent;
			}

		public void setRent(int rent)
			{
				this.rent = rent;
			}

		public static void fillList()
			{
				position.add(new Property("Go", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Dagobah: Yoda's Hut", 60, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Rebels", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Dagobah: Swamp", 60, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Docking Tax", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Tie Fighter", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Hoth: North Ridge", 100, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Imperial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Hoth: Echo Base", 100, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Hoth: Frozen Plains", 120, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Just Visiting", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Tatooine: Mos Eisley", 140, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Reactor Core", 150, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Tatooine: Spaceport", 140, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Tatooine: Last Homestead", 160, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Millennium Falcon", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Yavin 4: Temple Throne Room", 180, 14, 100, 70, 200, 550, 750, 100, 950));
				position.add(new Property("Rebels", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Yavin 4: War Room", 180, 14, 100, 70, 200, 550, 750, 100, 950));
				position.add(new Property("Yavin 4: Massassi Temple", 200, 15, 100, 80, 220, 600, 800, 100, 1000));
				position.add(new Property("Free Space", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Cloud City: Reactor Control Room", 220, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Imperial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Cloud City: Landing Platform", 220, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Cloud City: Carbon Freezing Chamber", 240, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("X-Wing Fighter", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Death Star: Throne Room", 260, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Death Star: Central Core", 260, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Moisture Farm", 150, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Death Star: Landing Bay", 280, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Go To Jail", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Endor: Ewok Village", 300, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Endor: Forest", 300, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Rebels", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Endor: Shield Generator", 320, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Star Destroyer", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Imperial", 0, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Coruscant: Monument Square", 350, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Bounty", 200, 0, 0, 0, 0, 0, 0, 0, 0));
				position.add(new Property("Coruscant: Imperial Palace", 400, 50, 200, 200, 600, 1400, 1700, 200, 2000));
			}

	}