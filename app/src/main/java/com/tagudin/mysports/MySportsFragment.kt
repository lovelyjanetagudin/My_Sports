package com.tagudin.mysports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MySportsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_my_sports, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardFootball = view.findViewById<View>(R.id.card_football)
        val cardBasketball = view.findViewById<View>(R.id.card_basketball)
        val cardTennis = view.findViewById<View>(R.id.card_tennis)
        val cardSwimming = view.findViewById<View>(R.id.card_swimming)

        cardFootball.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_footballFragment)
        }

        cardBasketball.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_basketballFragment)
        }

        cardTennis.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_tennisFragment)
        }

        cardSwimming.setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_swimmingFragment)
        }
    }
}
