
module.exports = {
    // Change build path to make the liferay-npm-bundler find it
    outputDir: 'build/resources/main/META-INF/resources/lib',
    runtimeCompiler: true,
    devServer: {
        port: 8088
    },
    pages: {
        index: {
            entry: 'dev/index.js',
            template: 'dev/index.html'
        }
    },
    css: {
        // Enable CSS source maps.
        sourceMap: true,
    },
    configureWebpack: {
        performance: {
            hints: false
        }
    }
};

