package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter(createTips())
    }

    private fun createTips(): List<Tip> {
        return listOf(
            Tip(1, "Prioritize Protein in Every Meal","Start the day by including at least 30g of protein in each meal. Incorporate lean meats, fish, eggs, and plant-based proteins like tofu or lentils. Protein is essential for muscle repair and growth.", R.drawable.avocado),
            Tip(2, "Add Healthy Fats","Incorporate healthy fats like avocado, nuts, seeds, and olive oil into your meals. Fats help with hormone production, which is crucial for muscle building.", R.drawable.quinoa),
            Tip(3, "Hydrate Throughout the Day","Muscles are 75% water, so stay hydrated. Drink at least 3 liters of water per day, especially before and after workouts.", R.drawable.gymbag),
            Tip(4, "Pre-Workout Fuel","Before workouts, consume a meal with a mix of carbs and protein. A bowl of oatmeal with a scoop of protein powder or a banana with peanut butter is a great choice.", R.drawable.oatmeal),
            Tip(5, "Focus on Whole Foods","Whole, unprocessed foods provide better nutrition for muscle building. Choose whole grains, fresh vegetables, and lean meats over processed snacks and refined grains.", R.drawable.foodsalad),
            Tip(6,"Post-Workout Recovery" ,"Post-workout, aim for a meal with protein and carbohydrates to replenish glycogen and repair muscle. A protein shake with a banana is a simple and effective choice.", R.drawable.banana),
            Tip(7,"Eat Frequently" ,"To support muscle growth, eat 5-6 small meals a day. This ensures a steady supply of nutrients for recovery and building muscle", R.drawable.meal_prep),
            Tip(8,"Don’t Forget Carbohydrates" ,"Carbs are the body’s preferred source of energy. Include complex carbohydrates like sweet potatoes, quinoa, and brown rice in your meals to fuel your workouts.", R.drawable.sweet_potato),
            Tip(9,"Get Enough Sleep" ,"Sleep is crucial for muscle recovery. Aim for 7-9 hours of sleep each night to maximize recovery and performance.", R.drawable.peaceful_bedroom),
            Tip(10,"Incorporate Omega-3s" ,"Omega-3 fatty acids are essential for reducing inflammation and promoting muscle recovery. Add salmon, flaxseeds, or chia seeds to your diet.", R.drawable.salmon_dish),
            Tip(11,"Add Creatine" ," Creatine is one of the most researched supplements for muscle building. It helps increase strength and improves workout performance. Take 5g per day for optimal results.", R.drawable.creatine_powder),
            Tip(12,"Include Fiber-Rich Foods" ,"Fiber aids digestion and helps maintain steady energy levels. Include fiber-rich foods like vegetables, whole grains, and legumes in your daily meals.", R.drawable.mixed_vegetables),
            Tip(13,"Try Intermittent Fasting" ,"For some, intermittent fasting can be an effective way to control calorie intake. Consider a 16:8 schedule where you fast for 16 hours and eat during an 8-hour window.", R.drawable.time),
            Tip(14,"Avoid Empty Calories" ,"Minimize foods high in sugar and low in nutrients, like soda, candy, and processed snacks. These don’t provide the building blocks you need for muscle growth.", R.drawable.healthy_fruit),
            Tip(15,"Balance Macronutrients" ,"Balance your intake of proteins, carbohydrates, and fats. A good starting ratio is 40% carbs, 30% protein, and 30% fats.", R.drawable.patatas),
            Tip(16,"Eat Protein Before Bed" ,"Eating a protein-rich snack before bed can help with overnight muscle repair. Cottage cheese, casein protein, or a handful of nuts are great choices.", R.drawable.cottagecheese),
            Tip(17,"Experiment with Smoothies" ,"Smoothies are a quick and easy way to consume nutrients. Blend protein powder, oats, spinach, and fruit for a nutrient-dense drink.", R.drawable.greensmoothies),
            Tip(18,"Plan Your Meals in Advance" ,"Meal prepping ensures you always have healthy options on hand. Plan and prepare your meals for the week to stay on track with your muscle-building goals.", R.drawable.meal),
            Tip(19,"Supplement with BCAAs" ,"Branched-chain amino acids (BCAAs) help prevent muscle breakdown during workouts. Take them before or during your training sessions.", R.drawable.suppli),
            Tip(20,"Monitor Caloric Intake" ,"To build muscle, you need to eat in a caloric surplus. Track your calories to ensure you’re eating enough to fuel muscle growth.", R.drawable.app),
            Tip(21,"Reduce Stress" ,"Chronic stress can negatively impact muscle growth. Practice stress-reducing techniques like meditation or yoga to stay on track.", R.drawable.yoga),
            Tip(22,"Try High-Calorie Snacks" ," To boost your calorie intake, add snacks like mixed nuts, peanut butter, or hummus to your daily diet.", R.drawable.gemini_generated_image_teigaoteigaoteig),
            Tip(23,"Get Enough Iron" ,"Iron supports oxygen transport in the body, essential for performance and recovery. Include iron-rich foods like spinach, lean meats, and lentils.", R.drawable.gemini_generated_image_i6dq3ei6dq3ei6dq),
            Tip(24," Focus on Recovery Days" ,"On recovery days, consume plenty of protein and keep your diet clean. Your body rebuilds muscle during rest, so proper nutrition is essential.", R.drawable.gemini_generated_image_slz4epslz4epslz4),
            Tip(25,"Try Eating More Eggs" ,"Eggs are a versatile, nutrient-dense food that provides high-quality protein and healthy fats. Eat them scrambled, boiled, or in an omelet.", R.drawable.gemini_generated_image_kkyypskkyypskkyy),
            Tip(26,"Drink Green Tea" ,"Green tea contains antioxidants that support recovery and fat loss. Consider drinking a cup daily as part of your routine.", R.drawable.gemini_generated_image_mvah1pmvah1pmvah),
            Tip(27,"Add More Spices" ,"Spices like turmeric and ginger have anti-inflammatory properties, which help in muscle recovery. Incorporate them into your meals.", R.drawable.gemini_generated_image_4t5chv4t5chv4t5c),
            Tip(28,"Stay Consistent" ,"Consistency is key. Keep your meal plan steady and avoid skipping meals. Muscle growth happens gradually, so stay on track with your nutrition.", R.drawable.gemini_generated_image_1mvcwn1mvcwn1mvc),
            Tip(29,"Use Whey Protein" ,"Whey protein is a fast-digesting protein ideal for post-workout recovery. Make it part of your routine to ensure you hit your protein goals.", R.drawable.gemini_generated_image_kg9zdokg9zdokg9z),
            Tip(30,"Celebrate Your Progress" ,"You’ve built healthy habits! Reflect on the progress you've made and adjust your plan as needed to continue growing stronger.", R.drawable.gemini_generated_image_afsecaafsecaafse),
            )

    }

}

