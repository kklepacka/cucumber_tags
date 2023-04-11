# language: en
Feature: KKL_test_tags

	Scenario Outline: KKL_test_tags
		Given an example scenario <parametre1>
		Given all step definitions are <parametre2>
		Given the scenario <parametre3>

		@regression
		Examples:
		| parametre1 | parametre2 | parametre3 |
		| "scenario 2" | "implemented 2" | "passes 2" |

		@sanity
		Examples:
		| parametre1 | parametre2 | parametre3 |
		| "scenario" | "implemented" | "passes" |