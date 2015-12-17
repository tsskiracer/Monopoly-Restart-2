import java.util.*;

public class MonopolyRunner
	{
		static int bankAccount=1500;
		static int turns = 0;
		static int location = 0;
		static int counter = 0;
		static int x = 1;
		static ArrayList<Property> inventory = new ArrayList<Property>();
		static ArrayList<Board> inventory2 = new ArrayList<Board>();
		public static void main(String[] args)
			{
				
				
				
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello and welcome to single player Monopoly where you cannot lose.");
				System.out.println("Would you like to continue? Type 'y' for yes and 'n' for no.");
				String endGame = userInput.next();
				System.out.println("Type '1' for star wars monopoly and 2 for regular.");
				int type=userInput.nextInt();
				if (type==1)
				{
					Property.fillList();
				do
					{
						
						System.out.println("User is on " + Property.position.get(location).getName());
						int diceRoll1 = ((int) ((Math.random() * 6) + 1));
						int diceRoll2 = ((int) ((Math.random() * 6) + 1));
						int diceRoll = diceRoll1 + diceRoll2;
						System.out.println("Hit 'r' to roll the dice.");
						String roll = userInput.next();
//						if(counter<1)
//							{
								diceRoll1=5;
								diceRoll2=5;
								diceRoll=10;
//							}
//						else
//							{
//								diceRoll = diceRoll1 + diceRoll2;
//							}
						if ((location + diceRoll) > 39)
							{
								location = location + diceRoll - 40;
								System.out.println("You have passed go and recieved $200.");
								bankAccount+=200;
							}

						else
							{
								location += diceRoll;
							}
						if (roll.equalsIgnoreCase("R"))
							{
								System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2 + ". You landed on " +  Property.position.get(location).getName() + ".");
								if ( Property.position.get(location).getName().equals("Imperial"))
									{
										int chanceAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += chanceAmt;
										System.out.println("You have landed on Imperial and recieved $" + chanceAmt + " as a bribe to destroy the rebels.");

									}
								else if (Property.position.get(location).getName().equals("Docking Tax") || Property.position.get(location).getName().equals("Bounty"))
									{
										System.out.println("You have landed on " + Property.position.get(location).getName() + " and must pay $200.");
										bankAccount-=200;
									}
								else if ( Property.position.get(location).getName().equals("Rebels"))
									{
										int ccAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += ccAmt;
										System.out.println(
												"You have landed on Rebels and have recieved $" + ccAmt + "as a gift for protecting the galaxy.");

									}
								else if (Property.position.get(location).getName().equals("Free Space"))
									{
										System.out.println("You have landed on Free Space. $400 has been added to your account.");
										bankAccount+=400;
									}
								else if(Property.position.get(location).getName().equals("Go"))
									{
										System.out.println("You landed on Go");
									}
								else if(Property.position.get(location).getName().equals("Just Visiting"))
									{
										System.out.println("You are now going backwards.");
										do
										{
											System.out.println("User is on " + Property.position.get(location).getName());
											int diceRolljv1 = ((int) ((Math.random() * 6) + 1));
											int diceRolljv2 = ((int) ((Math.random() * 6) + 1));
											int diceRolljv = 0-(diceRolljv1 + diceRolljv2);
											System.out.println("Hit 'r' to roll the dice.");
											String rolljv = userInput.next();
											//if (counter==5)
											//	{
												//	location=15;
													//diceRolljv=-5;
//												}
//											else 
//												{
													diceRolljv1=5;
													diceRolljv2=5;
													diceRolljv=-10;
//												}
											
											if ((location + diceRolljv) <0)
												{
													location = location + diceRolljv + 40;
													
												}

											else
												{
													location += diceRolljv;
												}
												
											if (roll.equalsIgnoreCase("R"))
												{
													System.out.println("You rolled a " + diceRolljv1 + " and a " + diceRolljv2 + ". You landed on " +  Property.position.get(location).getName() + ".");
													if ( Property.position.get(location).getName().equals("Imperial"))
														{
															int chanceAmt = (int) ((Math.random() * 750) + 100);
															bankAccount += chanceAmt;
															System.out.println("You have landed on Imperial and recieved $" + chanceAmt + " as a bribe to destroy the rebels.");

														}
													else if ( Property.position.get(location).getName().equals("Go") && counter > 0)
														{
															
														}
													else if (Property.position.get(location).getName().equals("Docking Tax") || Property.position.get(location).getName().equals("Bounty"))
														{
															System.out.println("You have landed on " + Property.position.get(location).getName() + " and must pay $200.");
															bankAccount-=200;
														}
													else if ( Property.position.get(location).getName().equals("Rebels"))
														{
															int ccAmt = (int) ((Math.random() * 750) + 100);
															bankAccount += ccAmt;
															System.out.println(
																	"You have landed on Rebels and have recieved $" + ccAmt + "as a gift for protecting the galaxy.");

														}
													else if (Property.position.get(location).getName().equals("Free Space"))
														{
															System.out.println("You have landed on Free Space. $400 has been added to your account.");
															bankAccount+=400;
														}
							
													
													else if (location == 30)

														{

															location = 10;
															System.out.println();
															System.out.println("You are in Jail.");

															do

																{
																	System.out.println("Type 'r' when you are ready to roll.");
																	String jRoll = userInput.next();
																	if (jRoll.equalsIgnoreCase("r"))
																		{

																			int diceRollJ1 = ((int) ((Math.random() * 6) + 1));

																			int diceRollJ2 = ((int) ((Math.random() * 6) + 1));

																			System.out.println("You rolled a " + diceRollJ1 + " and a "
																					+ diceRollJ2 + ".");

																			if (diceRollJ1 == diceRollJ2)

																				{

																					location = diceRollJ1 + diceRollJ2 + 10;

																					System.out.println("You got out of jail and moved " + (location - 10) + " places to " +  Property.position.get(location).getName() + ".");

																				}

																			else

																				{

																					System.out.println("Sorry, you cannot leave yet.");

																				}
																			if (turns == 2)
																				{
																					location = diceRollJ1 + diceRollJ2 + 10;
																					System.out.println("You must pay $50 to get out.");
																					System.out.println("When you pay, you will move " + (location - 10) + " places which puts you on " +  Property.position.get(location).getName() + ".");
																					bankAccount-= 50;
																				}
																			turns++;
																		}

																} while (location == 10 && turns < 3);
														}

													else
														{
															System.out.println("Would you like to buy the property? It costs $" + Property.position.get(location).getCost() + ". If yes, type 'y'. If not, type 'n'.");
															String buy = userInput.next();
															if (buy.equalsIgnoreCase("y"))
																{
																	System.out.println("You have now purchased this property. It has been added to your inventory.");
																	inventory.add(Property.position.get(location));
																	bankAccount -=  Property.position.get(location).getCost();
																	x++;
																} else
																{
																	System.out.println("You will have a chance to buy it if you land on it again.");
																}
														}
													
														}

											System.out.println("You have $" + bankAccount + " in your bank account.");
											System.out.print("You own ");
											if (x > 1)
												{
													for (int i = 0; i < inventory.size(); i++)
														{
															System.out.print(inventory.get(i).getName() + ", ");
														}
												} else
												{
													System.out.print("nothing");
												}
											System.out.println(".");
											counter++;
											System.out.println();
											System.out.println();
											
										} while (location==10);
										System.out.println("You are now going forwards");
									}
								else if ( Property.position.get(location).getName().equals("Go") && counter > 0)
									{
										System.out.println("You landed directly on go and have recieved $400");
										bankAccount += 400;
									}
								else if (location == 30)

									{

										location = 10;
										System.out.println();
										System.out.println("You are in Jail.");

										do

											{
												System.out.println("Type 'r' when you are ready to roll.");
												String jRoll = userInput.next();
												if (jRoll.equalsIgnoreCase("r"))
													{

														int diceRollJ1 = ((int) ((Math.random() * 6) + 1));

														int diceRollJ2 = ((int) ((Math.random() * 6) + 1));

														System.out.println("You rolled a " + diceRollJ1 + " and a "
																+ diceRollJ2 + ".");

														if (diceRollJ1 == diceRollJ2)

															{

																location = diceRollJ1 + diceRollJ2 + 10;

																System.out.println("You got out of jail and moved " + (location - 10) + " places to " +  Property.position.get(location).getName() + ".");

															}

														else

															{

																System.out.println("Sorry, you cannot leave yet.");

															}
														if (turns == 2)
															{
																location = diceRollJ1 + diceRollJ2 + 10;
																System.out.println("You must pay $50 to get out.");
																System.out.println("When you pay, you will move " + (location - 10) + " places which puts you on " +  Property.position.get(location).getName() + ".");
																bankAccount-= 50;
															}
														turns++;
													}

											} while (location == 10 && turns < 3);
									}

								else
									{
										System.out.println("Would you like to buy the property? It costs $" + Property.position.get(location).getCost() + ". If yes, type 'y'. If not, type 'n'.");
										String buy = userInput.next();
										if (buy.equalsIgnoreCase("y"))
											{
												System.out.println("You have now purchased this property. It has been added to your inventory.");
												inventory.add(Property.position.get(location));
												bankAccount -=  Property.position.get(location).getCost();
												x++;
											} else
											{
												System.out.println("You will have a chance to buy it if you land on it again.");
											}
									}
								
									}

						System.out.println("You have $" + bankAccount + " in your bank account.");
						System.out.print("You own ");
						if (x > 1)
							{
								for (int i = 0; i < inventory.size(); i++)
									{
										System.out.print(inventory.get(i).getName() + ", ");
									}
							} else
							{
								System.out.print("nothing");
							}
						System.out.println(".");
						counter++;
						System.out.println();
						System.out.println();
						
					} while (endGame.equalsIgnoreCase("y"));
				}
				else if(type==2)
				{
					Board.fillList();
					do
					{
						System.out.println("User is on " + Board.position.get(location).getName());
						int diceRoll1 = ((int) ((Math.random() * 6) + 1));
						int diceRoll2 = ((int) ((Math.random() * 6) + 1));
						int diceRoll = diceRoll1 + diceRoll2;
						System.out.println("Hit 'r' to roll the dice.");
						String roll = userInput.next();
						
						if ((location + diceRoll) > 39)
							{
								location = location + diceRoll - 40;
								System.out.println("You have passed go and recieved $200.");
								bankAccount+=200;
							}

						else
							{
								location += diceRoll;
							}
						if (roll.equalsIgnoreCase("R"))
							{
								System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2 + ". You landed on " +  Board.position.get(location).getName() + ".");
								if ( Board.position.get(location).getName().equals("Community Chest"))
									{
										int chanceAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += chanceAmt;
										System.out.println("You have landed on Community Chest and recieved $" + chanceAmt + " for your good deeds.");

									}
								else if (Board.position.get(location).getName().equals("Income Tax") || Board.position.get(location).getName().equals("Bounty"))
									{
										System.out.println("You have landed on " + Board.position.get(location).getName() + " and must pay $200.");
										bankAccount-=200;
									}
								else if ( Board.position.get(location).getName().equals("Chance"))
									{
										int ccAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += ccAmt;
										System.out.println(
												"You have landed on Chane and have recieved $" + ccAmt + " for winning the lottery.");

									}
								else if (Board.position.get(location).getName().equals("Free Space"))
									{
										System.out.println("You have landed on Free Space. $400 has been added to your account.");
										bankAccount+=400;
									}
								else if(Board.position.get(location).getName().equals("Just Visiting"))
									{
									System.out.println("You are now going backwards.");
									do
									{
										System.out.println("User is on " + Board.position.get(location).getName());
										int diceRolljv1 = ((int) ((Math.random() * 6) + 1));
										int diceRolljv2 = ((int) ((Math.random() * 6) + 1));
										int diceRolljv = 0-(diceRoll1 + diceRoll2);
										System.out.println("Hit 'r' to roll the dice.");
										String rolljv = userInput.next();
										
										if (location<0)
											{
												location= location+diceRolljv+40;
											}
										else
											{
												location+=diceRolljv;
											}
											
										if (roll.equalsIgnoreCase("R"))
											{
												System.out.println("You rolled a " + diceRolljv1 + " and a " + diceRolljv2 + ". You landed on " +  Board.position.get(location).getName() + ".");
												if ( Board.position.get(location).getName().equals("Community Chest"))
													{
														int chanceAmt = (int) ((Math.random() * 750) + 100);
														bankAccount += chanceAmt;
														System.out.println("You have landed on Community Chest and recieved $" + chanceAmt + " for your good deeds.");

													}
												else if (Board.position.get(location).getName().equals("Income Tax") || Board.position.get(location).getName().equals("Bounty"))
													{
														System.out.println("You have landed on " + Board.position.get(location).getName() + " and must pay $200.");
														bankAccount-=200;
													}
												else if ( Board.position.get(location).getName().equals("Chance"))
													{
														int ccAmt = (int) ((Math.random() * 750) + 100);
														bankAccount += ccAmt;
														System.out.println(
																"You have landed on Chane and have recieved $" + ccAmt + " for winning the lottery.");

													}
												else if (Board.position.get(location).getName().equals("Free Space"))
													{
														System.out.println("You have landed on Free Space. $400 has been added to your account.");
														bankAccount+=400;
													}
												else if(Board.position.get(location).getName().equals("Just Visiting"))
													{
														System.out.println("Say hello to Fred for me");
													}
												else if ( Board.position.get(location).getName().equals("Go") && counter > 0)
													{
														System.out.println("You landed directly on go and have recieved $400");
														bankAccount += 400;
													}
												else if (location == 30)

													{

														location = 10;
														System.out.println();
														System.out.println("You are in Jail.");

														do

															{
																System.out.println("Type 'r' when you are ready to roll.");
																String jRoll = userInput.next();
																if (jRoll.equalsIgnoreCase("r"))
																	{

																		int diceRollJ1 = ((int) ((Math.random() * 6) + 1));

																		int diceRollJ2 = ((int) ((Math.random() * 6) + 1));

																		System.out.println("You rolled a " + diceRollJ1 + " and a "
																				+ diceRollJ2 + ".");

																		if (diceRollJ1 == diceRollJ2)

																			{

																				location = diceRollJ1 + diceRollJ2 + 10;

																				System.out.println("You got out of jail and moved " + (location - 10) + " places to " +  Property.position.get(location).getName() + ".");

																			}

																		else

																			{

																				System.out.println("Sorry, you cannot leave yet.");

																			}
																		if (turns == 2)
																			{
																				location = diceRollJ1 + diceRollJ2 + 10;
																				System.out.println("You must pay $50 to get out.");
																				System.out.println("When you pay, you will move " + (location - 10) + " places which puts you on " +  Property.position.get(location).getName() + ".");
																				bankAccount-= 50;
																			}
																		turns++;
																	}

															} while (location == 10 && turns < 3);
													}

												else
													{
														System.out.println("Would you like to buy the property? It costs $" + Board.position.get(location).getCost() + ". If yes, type 'y'. If not, type 'n'.");
														String buy = userInput.next();
														if (buy.equalsIgnoreCase("y"))
															{
																System.out.println("You have now purchased this property. It has been added to your inventory.");
																inventory2.add(Board.position.get(location));
																bankAccount -=  Board.position.get(location).getCost();
																x++;
															} else
															{
																System.out.println("You will have a chance to buy it if you land on it again.");
															}
													}
												
													}

										System.out.println("You have $" + bankAccount + " in your bank account.");
										System.out.print("You own ");
										if (x > 1)
											{
												for (int i = 0; i < inventory2.size(); i++)
													{
														System.out.print(inventory2.get(i).getName() + ", ");
													}
											} 
										else
											{
												System.out.print("nothing");
											}
										System.out.println(".");
										counter++;
										System.out.println();
										System.out.println();
										
									} while (location!=10);
									}
								else if ( Board.position.get(location).getName().equals("Go") && counter > 0)
									{
										System.out.println("You landed directly on go and have recieved $400");
										bankAccount += 400;
									}
								else if (location == 30)

									{

										location = 10;
										System.out.println();
										System.out.println("You are in Jail.");

										do

											{
												System.out.println("Type 'r' when you are ready to roll.");
												String jRoll = userInput.next();
												if (jRoll.equalsIgnoreCase("r"))
													{

														int diceRollJ1 = ((int) ((Math.random() * 6) + 1));

														int diceRollJ2 = ((int) ((Math.random() * 6) + 1));

														System.out.println("You rolled a " + diceRollJ1 + " and a "
																+ diceRollJ2 + ".");

														if (diceRollJ1 == diceRollJ2)

															{

																location = diceRollJ1 + diceRollJ2 + 10;

																System.out.println("You got out of jail and moved " + (location - 10) + " places to " +  Property.position.get(location).getName() + ".");

															}

														else

															{

																System.out.println("Sorry, you cannot leave yet.");

															}
														if (turns == 2)
															{
																location = diceRollJ1 + diceRollJ2 + 10;
																System.out.println("You must pay $50 to get out.");
																System.out.println("When you pay, you will move " + (location - 10) + " places which puts you on " +  Property.position.get(location).getName() + ".");
																bankAccount-= 50;
															}
														turns++;
													}

											} while (location == 10 && turns < 3);
									}

								else
									{
										System.out.println("Would you like to buy the property? It costs $" + Board.position.get(location).getCost() + ". If yes, type 'y'. If not, type 'n'.");
										String buy = userInput.next();
										if (buy.equalsIgnoreCase("y"))
											{
												System.out.println("You have now purchased this property. It has been added to your inventory.");
												inventory2.add(Board.position.get(location));
												bankAccount -=  Board.position.get(location).getCost();
												x++;
											} else
											{
												System.out.println("You will have a chance to buy it if you land on it again.");
											}
									}
								
									}

						System.out.println("You have $" + bankAccount + " in your bank account.");
						System.out.print("You own ");
						if (x > 1)
							{
								for (int i = 0; i < inventory2.size(); i++)
									{
										System.out.print(inventory2.get(i).getName() + ", ");
									}
							} 
						else
							{
								System.out.print("nothing");
							}
						System.out.println(".");
						counter++;
						System.out.println();
						System.out.println();
						
					} while (endGame.equalsIgnoreCase("y"));
				}
				else
				{
					System.out.println("Please restart");
				}
			}
	}