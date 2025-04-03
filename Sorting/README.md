Sorting Algorithm	Best Case (Ω)	Average Case (Θ)	Worst Case (O)	Space Complexity	Stable?
Bubble Sort	         𝑂(𝑛)	           𝑂(𝑛²)	            𝑂(𝑛²)	           𝑂(1)	          ✅ Yes
Selection Sort	     𝑂(𝑛²)	       𝑂(𝑛²)	            𝑂(𝑛²)	           𝑂(1)	          ❌ No
Insertion Sort	     𝑂(𝑛)	           𝑂(𝑛²)	            𝑂(𝑛²)	           𝑂(1)	          ✅ Yes
Merge Sort	         𝑂(𝑛 log 𝑛)	    𝑂(𝑛 log 𝑛)	      𝑂(𝑛 log 𝑛)	      𝑂(𝑛)	          ✅ Yes
Quick Sort	         𝑂(𝑛 log 𝑛)	    𝑂(𝑛 log 𝑛)	      𝑂(𝑛²)	         𝑂(log 𝑛)	         ❌ No


For small input size (𝑛 < 1000) → Insertion Sort (if nearly sorted, 𝑂(𝑛))

For large input size → Merge Sort or Quick Sort (𝑂(𝑛 log 𝑛))

For best stable sorting → Merge Sort (𝑂(𝑛 log 𝑛) but requires extra space)

For in-place and efficient sorting → Quick Sort (average 𝑂(𝑛 log 𝑛), worst 𝑂(𝑛²))


📌 Merge Sort, Quick Sort, and Heap Sort → 𝑂(𝑛 log 𝑛) (Best for large datasets).