package com.catnip.cowboyshoot.ui.onboarding.entername

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.catnip.cowboyshoot.databinding.FragmentEnterNameBinding
import com.catnip.cowboyshoot.ui.menu.MenuActivity
import com.catnip.cowboyshoot.ui.onboarding.OnFinishNavigateListener


class EnterNameFragment : Fragment(), OnFinishNavigateListener {

    private lateinit var binding: FragmentEnterNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentEnterNameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onFinishNavigateListener() {
        val name = binding.etName.text.toString().trim()
        if(name.isEmpty()){
            Toast.makeText(requireContext(), "Please Input Your Name !", Toast.LENGTH_SHORT).show()
        }else{
            navigateToMenu(name)
        }
    }

    fun navigateToMenu(name:String){
        //Todo: navigate to menu
        val intent = Intent(getActivity(), MenuActivity::class.java)
        intent.putExtra(MenuActivity.EXTRA_TEXT, name)
        startActivity(intent)

        Toast.makeText(requireContext(), "Name: $name", Toast.LENGTH_SHORT).show()
    }
}



