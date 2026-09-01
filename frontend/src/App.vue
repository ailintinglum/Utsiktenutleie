<script setup lang="ts">
const apiUrl = import.meta.env.VITE_API_URL || 'http://localhost:8080/api'
</script>

<template>
  <main class="min-h-screen bg-slate-50 text-slate-900">
    <div class="mx-auto max-w-6xl px-6 py-16 sm:px-8 lg:px-10">
      <header class="py-10 text-center">
        <p class="mb-4 text-xs font-bold uppercase tracking-[0.22em] text-slate-500">
          Utsikten Utleie
        </p>
        <h1 class="text-4xl font-bold tracking-tight text-slate-900 sm:text-6xl">
          Book your cabin with a view.
        </h1>
        <p class="mx-auto mt-6 max-w-2xl text-lg text-slate-600">
          A simple starter for holiday bookings, cabins, and reservation management.
        </p>

        <div class="mt-8 inline-flex items-center gap-3 rounded-full border border-slate-200 bg-white/80 px-4 py-3 shadow-sm backdrop-blur-sm">
          <span class="text-sm text-slate-500">API target</span>
          <code class="rounded-md bg-slate-900 px-2 py-1 text-sm text-slate-100">{{ apiUrl }}</code>
        </div>
      </header>

      <section class="mt-12 grid gap-6 md:grid-cols-3">
        <article class="rounded-2xl border border-slate-200 bg-white p-6 shadow-sm">
          <h2 class="mb-3 text-xl font-semibold text-slate-900">Cabin list</h2>
          <p class="text-slate-600">Browse available cabins and pricing.</p>
        </article>

        <article class="rounded-2xl border border-slate-200 bg-white p-6 shadow-sm">
          <h2 class="mb-3 text-xl font-semibold text-slate-900">Booking flow</h2>
          <p class="text-slate-600">Collect guest information and reservation details.</p>
        </article>

        <article class="rounded-2xl border border-slate-200 bg-white p-6 shadow-sm">
          <h2 class="mb-3 text-xl font-semibold text-slate-900">Admin tools</h2>
          <p class="text-slate-600">Manage bookings and host availability later.</p>
        </article>
      </section>
    </div>
  </main>
</template>
